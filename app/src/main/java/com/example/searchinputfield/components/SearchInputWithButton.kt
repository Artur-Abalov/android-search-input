package com.example.searchinputfield.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchInputWithButton(
    value: String,
    onInputValueChange: (String) -> Unit,
    onSubmit: () -> Unit,
    inputModifier: Modifier = Modifier,
    buttonModifier: Modifier = Modifier,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        NumericSearchInput(
            value = value,
            onValueChange = onInputValueChange,
            modifier = inputModifier,
        )
        SubmitButton(modifier = buttonModifier, onClick = onSubmit)
    }
}

@Preview
@Composable
private fun SearchInputWithButtonPreview() {
    var text by remember {
        mutableStateOf("test")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {
        SearchInputWithButton(value = text, onInputValueChange = { newVal -> text = newVal }, onSubmit = {})
    }
}
