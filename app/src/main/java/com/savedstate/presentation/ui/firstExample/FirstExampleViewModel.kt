package com.savedstate.presentation.ui.firstExample

import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class FirstExampleViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _counter = MutableLiveData<Int>(0)
    val counter: LiveData<Int> = _counter

    init {
        savedStateHandle.get<Int>(STATE_KEY_COUNTER)?.let { counter ->
            _counter.value = counter
        }
    }

    fun increaseCounter() {
        _counter.value = (_counter.value ?: 0) + 1
        savedStateHandle.set(STATE_KEY_COUNTER, counter.value)
    }

    override fun onCleared() {
//        savedStateHandle.set(STATE_KEY_COUNTER, counter.value)
        Log.d("TESTING", "OnCleared")
        super.onCleared()
    }

    companion object {
        private const val STATE_KEY_COUNTER = "CounterKey"
    }
}