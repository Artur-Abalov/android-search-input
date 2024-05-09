package com.example.searchinputfield.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.searchinputfield.screens.mainScreen.MainScreen
import com.example.searchinputfield.screens.resultScreen.ResultScreen

@Composable
fun Navigation() {
    val controller = rememberNavController()

    fun navigateToResult(query: String) {
        controller.navigate("${Screen.ResultScreen.route}/$query")
    }

    NavHost(navController = controller, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navigateToResult = ::navigateToResult)
        }
        composable(route = "${Screen.ResultScreen.route}/{query}", arguments = listOf(navArgument("query") { type = NavType.StringType })) {
            ResultScreen(result = it.arguments?.getString("query", "") ?: "")
        }
    }
}
