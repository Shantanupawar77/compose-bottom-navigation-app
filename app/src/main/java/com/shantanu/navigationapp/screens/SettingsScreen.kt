package com.mastercoding.navigationapp.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SettingsScreen(
    navigateToHome: () -> Unit
) {
    ScreenContainer(title = "Settings") {
        Button(onClick = navigateToHome) {
            Text("Back to Home")
        }
    }
}
