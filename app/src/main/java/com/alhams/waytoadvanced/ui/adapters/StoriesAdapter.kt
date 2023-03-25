package com.alhams.waytoadvanced.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alhams.waytoadvanced.R
import com.alhams.waytoadvanced.data.domain.Story
import com.alhams.waytoadvanced.databinding.ItemStoryBinding
import com.bumptech.glide.Glide

class StoriesAdapter(private val stories: List<Story>) :
    RecyclerView.Adapter<StoriesAdapter.StoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(root.context)
                .load(stories[position].photoUrl)
                .into(ivStory)
        }
    }

    override fun getItemCount() = stories.size


    class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemStoryBinding.bind(itemView)
    }
}

