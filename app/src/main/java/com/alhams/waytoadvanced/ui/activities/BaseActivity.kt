package com.alhams.waytoadvanced.ui.activities

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected lateinit var _binding: VB
    abstract val bindingInflater: (LayoutInflater) -> VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(_binding.root)
        addCallBacks()
    }

    abstract fun addCallBacks()
}