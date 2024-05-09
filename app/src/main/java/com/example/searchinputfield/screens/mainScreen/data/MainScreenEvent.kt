package com.example.searchinputfield.screens.mainScreen.data

sealed class MainScreenEvent {
    data class SearchInputChange(val query: String) : MainScreenEvent()
}
