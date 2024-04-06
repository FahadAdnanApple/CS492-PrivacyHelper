package com.example.cs492.features.app_permissions.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cs492.components.ExpandableCard
import com.example.cs492.components.ExpandableHeaderCardData
import com.example.cs492.components.StandardText
import com.example.cs492.data.app_permission.AppPermissionType
import com.example.cs492.features.home.data.DangerousPermissionCardData
import com.example.cs492.features.home.data.NormalPermissionCardData
import com.example.cs492.features.home.data.SignaturePermissionCardData

@Composable
fun AppPermissionListScreen(
    navController: NavController,
    backStackEntry: String
) {
    val content = when (backStackEntry) {
        AppPermissionType.NORMAL.toString() -> "Normal permissions cover areas where your app needs to access data or resources outside the app's sandbox, but where there's very little risk to the user's privacy or the operation of other apps. Examples include setting the time zone or accessing the internet."
        AppPermissionType.DANGEROUS.toString()  -> "Dangerous permissions cover areas where the app wants data or resources that involve the user's private information, or could potentially affect the user's stored data or the operation of other apps. Examples include reading contacts, calendar events, or the user's location."
        AppPermissionType.SIGNATURE.toString()  -> "Signature permissions are granted by the system to applications that are signed with the same certificate, allowing them to share and access each other's data and resources directly."
        else -> "Unknown permission type."
    }

    val listData: List<ExpandableHeaderCardData> = when (backStackEntry) {
        AppPermissionType.NORMAL.toString() -> NormalPermissionCardData
        AppPermissionType.DANGEROUS.toString()  -> DangerousPermissionCardData
        AppPermissionType.SIGNATURE.toString()  -> SignaturePermissionCardData
        else -> SignaturePermissionCardData
    }

    val title: String =  when (backStackEntry) {
        AppPermissionType.NORMAL.toString() -> "A list of popular normal-runtime permissions"
        AppPermissionType.DANGEROUS.toString()  -> "A list of popular dangerous-runtime permissions"
        AppPermissionType.SIGNATURE.toString()  -> "A list of popular signature permissions"
        else -> ""
    }

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
            item { StandardText(value = "App Permissions - $backStackEntry", fontSize = 18.sp) }
            item { StandardText(value = content.trimIndent(), fontSize = 14.sp) }

            item {
                Text(
                    text = title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    style = MaterialTheme.typography.labelLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }

            listData.forEach {
                item { ExpandableCard(navController, it) }
            }

        }
    }
}