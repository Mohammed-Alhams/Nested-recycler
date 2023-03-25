package com.alhams.waytoadvanced.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alhams.waytoadvanced.data.DataSource
import com.alhams.waytoadvanced.data.domain.HomeItem
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType.TYPE_NEW_POST
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType.TYPE_STORIES
import com.alhams.waytoadvanced.databinding.FragmentHomeBinding
import com.alhams.waytoadvanced.ui.adapters.HomeAdapter
import com.alhams.waytoadvanced.util.toHomeItem

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding =
        FragmentHomeBinding::inflate

    override fun setUp() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem(DataSource.getStories(), TYPE_STORIES))
        itemsList.add(HomeItem("Update your feed", TYPE_NEW_POST))
        itemsList.addAll(
            DataSource.getPosts().map { it.toHomeItem() },
        )
        binding.rvHome.adapter = HomeAdapter(itemsList)
    }

    override fun addCallBacks() {
    }
}