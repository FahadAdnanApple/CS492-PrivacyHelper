package com.example.cs492.features.android_settings_walk_through.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cs492.Screen
import com.example.cs492.components.SecondaryButton
import com.example.cs492.components.StandardText
import com.example.cs492.data.android_setting.AndroidSettingType


@Composable
fun AndroidSettingsHomeScreen(
    navController: NavController,
) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                StandardText(
                    value = "Navigating Security on Your Android Phone",
                    fontSize = 18.sp
                )
            }
            item {
                StandardText(
                    value = """
                        
                    Android phones come with various security features to protect your data and privacy. 
                    
                    Understanding these features and how to navigate them is crucial for maintaining a secure device. 
                    
                    This guide will cover the essential security settings and best practices to keep your Android phone secure.
                    
                """.trimIndent(), fontSize = 14.sp
                )
            }
            item {
                StandardText(
                    value = "Explore these categories to learn more:",
                    fontSize = 16.sp
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Screen Lock",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.SCREEN_LOCK
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Privacy",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.PRIVACY
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Find My Device",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.FIND_MY_DEVICE
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Google Play Protect",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.GOOGLE_PLAY_PROTECT
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Root Detection",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.ROOT_DETECTION
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Software Updates",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.SOFTWARE_UPDATES
                            )
                        )
                    },
                )
            }

            item { Spacer(modifier = Modifier.height(20.dp)) }
            item {
                SecondaryButton(
                    text = "Device Encryption",
                    onClick = {
                        navController.navigate(
                            Screen.AndroidSettingList.createRoute(
                                AndroidSettingType.DEVICE_ENCRYPTION
                            )
                        )
                    },
                )
            }
        }
    }
}
