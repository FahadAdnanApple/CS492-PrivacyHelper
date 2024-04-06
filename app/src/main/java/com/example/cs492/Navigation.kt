package com.example.cs492

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.cs492.components.NavigationDrawerWrapper
import com.example.cs492.features.android_settings_walk_through.screens.AndroidSettingsHomeScreen
import com.example.cs492.features.android_settings_walk_through.screens.AndroidSettingsListScreen
import com.example.cs492.features.app_marketplaces.screens.AppMarketplaceHomeScreen
import com.example.cs492.features.app_permissions.screens.AppPermissionBreakdownScreen
import com.example.cs492.features.app_permissions.screens.AppPermissionHomeScreen
import com.example.cs492.features.app_permissions.screens.AppPermissionListScreen
import com.example.cs492.features.app_permissions.screens.AppPermissionTypesScreen
import com.example.cs492.features.blog_section.screens.BlogSectionHomeScreen
import com.example.cs492.features.home.screens.HomeScreen
import com.example.cs492.firebaseauth.screens.InitialAuthScreen
import com.example.cs492.firebaseauth.screens.LoginScreen
import com.example.cs492.firebaseauth.screens.ResetPasswordScreen
import com.example.cs492.firebaseauth.screens.SignupScreen

@Composable
fun Navigation(
    loggedIn: Boolean,
    modifier: Modifier,
    navController: NavHostController,
) {
    var start: String = if (!loggedIn) Screen.InitialAuthScreen.route else Screen.Home.route

    return NavHost(navController = navController, startDestination = start, modifier = modifier) {
        // Auth Screens
        composable(Screen.InitialAuthScreen.route) { InitialAuthScreen(navController = navController) }
        composable(Screen.Signup.route) { SignupScreen(navController = navController) }
        composable(Screen.Login.route) { LoginScreen(navController = navController) }
        composable(Screen.ResetPassword.route) { ResetPasswordScreen(navController = navController) }

        // Home Screens
        composable(Screen.Home.route) {
            NavigationDrawerWrapper(navController = navController, children = { HomeScreen(navController) }, itemIndex = Screen.Home.drawerItem)
        }
        // Actual Features:
        composable(Screen.AppPermission.route) {
            NavigationDrawerWrapper(navController = navController, children = { AppPermissionHomeScreen(navController) }, itemIndex = Screen.AppPermission.drawerItem)
        }
        composable(Screen.AndroidSettings.route) {
            NavigationDrawerWrapper(navController = navController, children = { AndroidSettingsHomeScreen(navController) }, itemIndex = Screen.AndroidSettings.drawerItem)
        }
        composable(Screen.BlogSection.route) {
            NavigationDrawerWrapper(navController = navController, children = { BlogSectionHomeScreen() }, itemIndex = Screen.BlogSection.drawerItem)
        }
        composable(Screen.AppMarketplace.route) {
            NavigationDrawerWrapper(navController = navController, children = { AppMarketplaceHomeScreen() }, itemIndex = Screen.AppMarketplace.drawerItem)
        }


        // App Permission Routes:
        composable(Screen.AppPermissionOverview.route) {
            NavigationDrawerWrapper(
                navController = navController,
                children = { AppPermissionHomeScreen(navController) },
                itemIndex = Screen.AppPermissionOverview.drawerItem)
        }

        composable(
            route = Screen.AppPermissionList.route,
            arguments = listOf(navArgument("permissionType") { type = NavType.StringType })
        ) { backStackEntry ->
            val permissionTypeArg = backStackEntry.arguments?.getString("permissionType") ?: "DEFAULT_VALUE"
            NavigationDrawerWrapper(
                navController = navController,
                children = { AppPermissionListScreen(navController, permissionTypeArg) },
                itemIndex = Screen.AppPermissionList.drawerItem
            )
        }

        composable(Screen.AppPermissionBreakdown.route) {
            NavigationDrawerWrapper(
                navController = navController,
                children = { AppPermissionBreakdownScreen(navController) },
                itemIndex = Screen.AppPermissionBreakdown.drawerItem)
        }
        composable(Screen.AppPermissionTypesOfPermissions.route) {
            NavigationDrawerWrapper(
                navController = navController,
                children = { AppPermissionTypesScreen(navController) },
                itemIndex = Screen.AppPermissionTypesOfPermissions.drawerItem)
        }

        // App Setting Routes:
        composable(
            route = Screen.AppSettingList.route,
            arguments = listOf(navArgument("settingType") { type = NavType.StringType })
        ) { backStackEntry ->
            val settingTypeArg = backStackEntry.arguments?.getString("settingType") ?: "DEFAULT_VALUE"
            NavigationDrawerWrapper(
                navController = navController,
                children = { AndroidSettingsListScreen(navController, settingTypeArg) },
                itemIndex = Screen.AppSettingList.drawerItem
            )
        }
    }
}