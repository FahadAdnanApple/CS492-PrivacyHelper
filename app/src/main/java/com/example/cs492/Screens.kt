package com.example.cs492

import com.example.cs492.data.app_permission.AppPermissionType
import com.example.cs492.data.app_permission.Permission
import com.example.cs492.data.android_setting.AppSettingType


sealed class Screen(val route: String, var drawerItem: Int = 0) {

    // Auth Screens
    object InitialAuthScreen: Screen("initial-auth-screen")
    object Login: Screen("login")
    object Signup: Screen("signup")
    object ResetPassword: Screen("reset-password")

    // Main App Screens
    object Home: Screen("home", 0)
    object AppPermission: Screen("app_permissions", 1)
    object AndroidSettings: Screen("android_settings", 2)
    object BlogSection: Screen("blog_section", 3)
    object AppMarketplace: Screen("app_marketplaces", 4)


    // App Permission
    object AppPermissionOverview : Screen("app_permission_overview/{permission}", drawerItem = 1) {
        fun createRoute(permission: Permission) = "app_permission_overview/$permission"
    }
    object AppPermissionList : Screen("app_permission_list/{permissionType}", drawerItem = 1) {
        fun createRoute(permissionType: AppPermissionType) = "app_permission_list/$permissionType"
    }
    object AppPermissionBreakdown : Screen("app_permission_list/{permission}", drawerItem = 1) {
        fun createRoute(permission: String) = "app_permission_list/$permission"
    }
    object AppPermissionTypesOfPermissions: Screen("app_permission_types", drawerItem = 1)

    // App Settings
    object AppSettingList: Screen("app_setting_list/{settingType}", drawerItem = 2) {
        fun createRoute(settingType: AppSettingType) = "app_setting_list/$settingType"
    }
}