package com.savedstate.presentation.ui.secondExample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.savedstate.R
import com.savedstate.databinding.FragmentExampleSecondBinding
import com.savedstate.presentation.ui.common.BaseFragment

class SecondExampleFragment(override val layoutId: Int = R.layout.fragment_example_second) :
    BaseFragment<FragmentExampleSecondBinding>() {

    private val viewModel: SecondExampleViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        setupView()
    }

    private fun setupView() {}
}
