package com.savedstate.presentation.ui.secondExample

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SecondExampleViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    var email: String = ""
        set(value) {
            field = value
            savedStateHandle.set(STATE_KEY_EMAIL, value)
        }
    var password: String = ""
        set(value) {
            field = value
            savedStateHandle.set(STATE_KEY_PASSWORD, value)
        }


    init {
        with(savedStateHandle) {
            get<String>(STATE_KEY_EMAIL)?.let { storedEmail -> email = storedEmail }
            get<String>(STATE_KEY_PASSWORD)?.let { storedPassword -> password = storedPassword }
        }
    }


    companion object {
        private const val STATE_KEY_EMAIL = "EMAIL_KEY"
        private const val STATE_KEY_PASSWORD = "PASSWORD_KEY"
    }

}

