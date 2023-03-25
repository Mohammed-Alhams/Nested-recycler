package com.alhams.waytoadvanced.util

import com.alhams.waytoadvanced.data.domain.HomeItem
import com.alhams.waytoadvanced.data.domain.Post
import com.alhams.waytoadvanced.data.domain.enums.HomeItemType

fun Post.toHomeItem(): HomeItem<Any> {
    return HomeItem(this, HomeItemType.TYPE_POST)
}