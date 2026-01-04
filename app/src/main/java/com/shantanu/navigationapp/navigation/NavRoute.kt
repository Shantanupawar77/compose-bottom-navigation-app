package com.mastercoding.navigationapp.navigation

sealed class NavRoute(val path: String) {

    object Home : NavRoute("home")

    object Profile : NavRoute("profile") {
        fun createRoute(id: Int, showDetails: Boolean): String {
            return "$path/$id/$showDetails"
        }
    }

    object Settings : NavRoute("settings")
}
