package com.savedstate.presentation.ui.main

import android.os.Bundle
import android.view.View
import com.savedstate.R
import com.savedstate.databinding.FragmentMainBinding
import com.savedstate.presentation.ui.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment(override val layoutId: Int = R.layout.fragment_main) :
    BaseFragment<FragmentMainBinding>() {

    private val navigator: MainNavigator by lazy {
        MainActivityNavigator(this.requireActivity() as MainActivity)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding){
        buttonFirst.setOnClickListener{ navigator.navigateToFirstExample()}
        buttonSecond.setOnClickListener{ navigator.navigateToSecondExample()}
        buttonThird.setOnClickListener{ navigator.navigateToThirdExample()}
    }
}

