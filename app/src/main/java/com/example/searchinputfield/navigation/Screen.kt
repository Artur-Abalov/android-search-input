package com.example.searchinputfield.navigation

sealed class Screen(val route: String) {
    data object MainScreen : Screen(route = "main")

    data object ResultScreen : Screen(route = "result")
}
