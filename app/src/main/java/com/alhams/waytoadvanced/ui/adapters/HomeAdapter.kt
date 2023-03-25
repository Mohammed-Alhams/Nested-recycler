package com.alhams.waytoadvanced.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alhams.waytoadvanced.R
import com.alhams.waytoadvanced.data.domain.HomeItem
import com.alhams.waytoadvanced.data.domain.Post
import com.alhams.waytoadvanced.data.domain.Story
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType.TYPE_NEW_POST
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType.TYPE_POST
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType.TYPE_STORIES
import com.alhams.waytoadvanced.databinding.ItemPostBinding
import com.alhams.waytoadvanced.databinding.ItemStoryListBinding
import com.alhams.waytoadvanced.databinding.ItemWritePostBinding
import com.bumptech.glide.Glide

class HomeAdapter(private val items: List<HomeItem<Any>>) :
    RecyclerView.Adapter<HomeAdapter.BasicViewHolder>() {

    sealed class BasicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class PostViewHolder(itemView: View) : BasicViewHolder(itemView) {
        val binding = ItemPostBinding.bind(itemView)
    }

    class StoryListViewHolder(itemView: View) : BasicViewHolder(itemView) {
        val binding = ItemStoryListBinding.bind(itemView)
    }

    class NewPostViewHolder(itemView: View) : BasicViewHolder(itemView) {
        val binding = ItemWritePostBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicViewHolder {
        return when (viewType) {
            ITEM_TYPE_POST -> {
                PostViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
                )
            }

            ITEM_TYPE_STORY -> {
                StoryListViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_story_list, parent, false)
                )
            }

            ITEM_TYPE_NEW_POST -> {
                NewPostViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_write_post, parent, false)
                )
            }

            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BasicViewHolder, position: Int) {
        when (holder) {
            is NewPostViewHolder -> bindNewPost(holder, position)
            is PostViewHolder -> bindPost(holder, position)
            is StoryListViewHolder -> bindStories(holder, position)
        }
    }

    private fun bindNewPost(holder: NewPostViewHolder, position: Int) {
        val currentItem = items[position].item as String
        holder.binding.apply {
            etWritePost.hint = currentItem
        }
    }

    private fun bindPost(holder: PostViewHolder, position: Int) {
        val currentPost = items[position].item as Post
        holder.binding.apply {
            tvUsername.text = currentPost.userName
            tvPostTitle.text = currentPost.title
            Glide.with(root.context).load(currentPost.photoUrl).into(ivPostPhoto)
        }
    }

    private fun bindStories(holder: StoryListViewHolder, position: Int) {
        val stories = items[position].item as List<Story>
        val adapter = StoriesAdapter(stories)
        holder.binding.apply {
            rvStories.adapter = adapter
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return when (items[position].type) {
            TYPE_POST -> ITEM_TYPE_POST
            TYPE_STORIES -> ITEM_TYPE_STORY
            TYPE_NEW_POST -> ITEM_TYPE_NEW_POST
        }
    }

    companion object {
        const val ITEM_TYPE_POST = 1
        const val ITEM_TYPE_STORY = 2
        const val ITEM_TYPE_NEW_POST = 3
    }
}