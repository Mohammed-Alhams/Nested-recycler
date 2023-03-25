package com.alhams.waytoadvanced.data.domain

import com.alhams.waytoadvanced.data.domain.enums.HomeItemType

data class HomeItem<T>(val item: T, val type: HomeItemType)