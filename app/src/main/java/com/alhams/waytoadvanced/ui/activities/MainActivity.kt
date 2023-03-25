package com.alhams.waytoadvanced.ui.activities

import android.view.LayoutInflater
import com.alhams.waytoadvanced.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun addCallBacks() {
    }
}