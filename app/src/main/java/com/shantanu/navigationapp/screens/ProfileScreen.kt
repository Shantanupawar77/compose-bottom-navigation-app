package com.mastercoding.navigationapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(
    id: Int,
    showDetails: Boolean,
    navigateToSettings: () -> Unit
) {
    ScreenContainer(title = "Profile") {
        Text("User ID: $id")
        Text("Show Details: $showDetails")
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = navigateToSettings) {
            Text("Go to Settings")
        }
    }
}
