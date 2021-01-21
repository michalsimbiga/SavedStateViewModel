package com.savedstate.presentation.ui.firstExample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.savedstate.R
import com.savedstate.databinding.FragmentExampleFirstBinding
import com.savedstate.presentation.ui.common.BaseFragment

class FirstExampleFragment(override val layoutId: Int = R.layout.fragment_example_first) :
    BaseFragment<FragmentExampleFirstBinding>() {

    private val viewModel: FirstExampleViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }


}
