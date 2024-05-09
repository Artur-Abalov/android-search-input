package com.example.searchinputfield.screens.mainScreen

import androidx.lifecycle.ViewModel
import com.example.searchinputfield.base.EventListener
import com.example.searchinputfield.screens.mainScreen.data.MainScreenEvent
import com.example.searchinputfield.screens.mainScreen.data.MainScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainScreenViewModel : ViewModel(), EventListener<MainScreenEvent> {
    private val mainScreenState = MutableStateFlow(MainScreenState())
    val uiState = mainScreenState.asStateFlow()

    override fun handleEvent(event: MainScreenEvent) {
        when (event) {
            is MainScreenEvent.SearchInputChange -> changeSearchInput(event.query)
        }
    }

    private fun changeSearchInput(query: String) {
        mainScreenState.update {
            it.copy(
                searchQuery = query,
            )
        }
    }
}
