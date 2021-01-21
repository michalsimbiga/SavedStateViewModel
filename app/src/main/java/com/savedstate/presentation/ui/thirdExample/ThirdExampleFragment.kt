package com.savedstate.presentation.ui.thirdExample

import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.savedstate.R
import com.savedstate.databinding.FragmentExampleThirdBinding
import com.savedstate.presentation.ui.common.BaseFragment
import com.savedstate.presentation.ui.thirdExample.adapters.StringAdapter

class ThirdExampleFragment(override val layoutId: Int = R.layout.fragment_example_third) :
    BaseFragment<FragmentExampleThirdBinding>() {

    private val viewModel: ThirdExampleViewModel by viewModels()

    private val adapter by lazy { StringAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        setupObservers()
    }

    private fun setupView() = with(binding) {
        rvThirdExample.adapter = adapter

        textQuery.doOnTextChanged { text, _, _, _ ->
            viewModel.setQuery(text.toString())
        }
    }

    private fun setupObservers() {
        viewModel.filteredData.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }

    override fun onDestroyView() {
        binding.rvThirdExample.adapter = null
        super.onDestroyView()
    }
}
