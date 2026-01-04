package com.mastercoding.navigationapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings

sealed class NavItem {
    object Home : Item("home", "Home", Icons.Default.Home)
    object Profile : Item("profile", "Profile", Icons.Default.Person)
    object Settings : Item("settings", "Settings", Icons.Default.Settings)
}
