package com.alhams.waytoadvanced.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding> : Fragment() {
    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> VB
    private lateinit var _binding: VB
    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater, container, false)
        binding = _binding
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
        addCallBacks()
    }

    abstract fun setUp()
    abstract fun addCallBacks()
}