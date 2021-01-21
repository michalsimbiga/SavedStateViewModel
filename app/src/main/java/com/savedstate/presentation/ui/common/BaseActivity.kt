package com.savedstate.presentation.ui.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<TViewBinding : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: TViewBinding

    private var defaultViewFlags: Int = 0

    abstract val layoutId: Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
        window.apply {
            defaultViewFlags = decorView.systemUiVisibility
        }
    }
}