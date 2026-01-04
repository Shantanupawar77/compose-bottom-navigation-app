package com.mastercoding.navigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mastercoding.navigationapp.screens.HomeScreen
import com.mastercoding.navigationapp.screens.ProfileScreen
import com.mastercoding.navigationapp.screens.SettingsScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = NavRoute.Home.path
    ) {

        composable(NavRoute.Home.path) {
            HomeScreen(
                navigateToProfile = { id, show ->
                    navController.navigate(
                        NavRoute.Profile.createRoute(id, show)
                    )
                },
                navigateToSettings = {
                    navController.navigate(NavRoute.Settings.path)
                }
            )
        }

        composable(
            route = "${NavRoute.Profile.path}/{id}/{showDetails}",
            arguments = listOf(
                navArgument("id") { type = NavType.IntType },
                navArgument("showDetails") { type = NavType.BoolType }
            )
        ) { backStackEntry ->
            ProfileScreen(
                id = backStackEntry.arguments?.getInt("id") ?: 0,
                showDetails = backStackEntry.arguments?.getBoolean("showDetails") ?: false,
                navigateToSettings = {
                    navController.navigate(NavRoute.Settings.path)
                }
            )
        }

        composable(NavRoute.Settings.path) {
            SettingsScreen(
                navigateToHome = {
                    navController.navigate(NavRoute.Home.path)
                }
            )
        }
    }
}




