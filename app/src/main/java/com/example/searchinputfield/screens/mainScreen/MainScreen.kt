package com.example.searchinputfield.screens.mainScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.searchinputfield.components.SearchInputWithButton
import com.example.searchinputfield.screens.mainScreen.data.MainScreenEvent

@Composable
fun MainScreen(navigateToResult: (query: String) -> Unit) {
    val viewModel = viewModel<MainScreenViewModel>()
    val uiState = viewModel.uiState.collectAsState()

    fun handleSearchInputChange(query: String) {
        viewModel.handleEvent(
            MainScreenEvent.SearchInputChange(query),
        )
    }

    fun handleSubmit() {
        navigateToResult(uiState.value.searchQuery)
    }

    MainScreenView(value = uiState.value.searchQuery, onInputChange = ::handleSearchInputChange, onSubmit = ::handleSubmit)
}

@Composable
private fun MainScreenView(
    value: String,
    onInputChange: (String) -> Unit,
    onSubmit: () -> Unit,
) {
    SearchInputWithButton(value = value, onInputValueChange = onInputChange, onSubmit = onSubmit)
}

@Preview
@Composable
private fun MainScreenPreview() {
}
