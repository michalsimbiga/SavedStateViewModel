package com.savedstate.presentation.ui.thirdExample

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*

class ThirdExampleViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _list =
        listOf("Kotlet", "Plecki", "Brzuszek", "Czekolada", "Krewetka", "Stopa")

    val filteredData: LiveData<List<String>> =
        savedStateHandle.getLiveData<String>(STATE_KEY_QUERY, "")
            .map { query -> _list.filter { it.contains(query, ignoreCase = true) } }


    fun setQuery(query: String) {
        savedStateHandle[STATE_KEY_QUERY] = query
    }

    companion object {
        private const val STATE_KEY_QUERY = "QUERY_KEY"
    }
}