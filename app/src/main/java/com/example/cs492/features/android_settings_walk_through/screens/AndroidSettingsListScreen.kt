package com.example.cs492.features.android_settings_walk_through.screens

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
import com.example.cs492.data.android_setting.AndroidSettingType
import com.example.cs492.features.home.data.ScreenLockCardData
import com.example.cs492.features.home.data.PrivacyCardData
import com.example.cs492.features.home.data.FindMyDeviceCardData
import com.example.cs492.features.home.data.GooglePlayProtectCardData
import com.example.cs492.features.home.data.RootDetectionCardData
import com.example.cs492.features.home.data.SoftwareUpdatesCardData
import com.example.cs492.features.home.data.DeviceEncryptionCardData

@Composable
fun AndroidSettingsListScreen(
    navController: NavController,
    backStackEntry: String
) {
    val content = when (backStackEntry) {
        AndroidSettingType.SCREEN_LOCK.toString() -> "Take control of your device's security and privacy with comprehensive screen lock settings. Navigate through a variety of options to strengthen your device’s protection and personalize your lock screen notifications and security.\n\n Through detailed explanations on customizing the visibility of notifications on your lock screen, and choosing the most suitable screen lock method, you'll learn how to configure your screen lock features, ensuring that your security preferences are met with confidence."
        AndroidSettingType.PRIVACY.toString()  -> "Take command of your personal information with the Personal Privacy settings. Navigate through a suite of options designed to bolster your device's confidentiality and grant you complete control over your data and privacy.\n\n The following detailed instructions aid in understanding the role each setting plays in protecting your privacy. You will learn to master the management of app permissions, data access, and advertising preferences to ensure your privacy needs are fully respected and catered to."
        AndroidSettingType.FIND_MY_DEVICE.toString()  -> "Discover the full capabilities of your Android device's security with the Device Recovery & Security settings. This suite of features provides you with the knowledge and tools to efficiently locate, secure, or erase your lost Android device. \n\n You will learn how 'Find My Device' becomes your automatic ally in protection as soon as you add a Google Account, offering you immediate preparedness against loss or theft. Should your device be unreachable, you will learn how to access its last recorded location. You will also discover how to manage your device's visibility on Google Play to ensure it remains within your control at all times."
        AndroidSettingType.GOOGLE_PLAY_PROTECT.toString()  -> "Elevate your device's security with Google Play Protect, your dedicated guardian against harmful apps and privacy threats. You will explore how this robust layer of protection continuously scans your apps and device, providing real-time alerts to ensure that only trustworthy applications are managing your data. \n\n Learn about Google Play Protect’s vigilant monitoring, which includes verifying the safety of apps before download, identifying harmful behaviour in device applications, and managing apps that don't meet Android's stringent security standards. You will understand the importance of device certification and how to verify it, ensuring that your device's integrity is maintained. You will also become familiar with sending unknown apps to Google for analysis, a proactive step in enhancing the detection of potentially dangerous apps."
        AndroidSettingType.ROOT_DETECTION.toString()  -> "Dive into the world of Android customization and security with the Root Detection settings. Here, you will embark on a journey to comprehend what it means for a device to be rooted, the implications of this level of access, and how it affects your device's integrity and warranty. Learn about the root status of your Android phone or tablet and the intricacies involved in the rooting process. \n\n Discover the signs of a rooted device within the 'About Phone' settings and understand the meaning behind a 'Custom' device status. We guide you through a clear path to verify whether your device has been modified beyond the manufacturer's default settings. You will learn about the challenges of reverting a device to its unrooted state and why a factory reset does not suffice."
        AndroidSettingType.SOFTWARE_UPDATES.toString()  -> "Navigate the path to maintaining your device's performance and security with the Software Updates settings. You will learn not only how to verify the current Android version of your device but also how to proactively check for and apply new updates. This is your central hub for ensuring that your device benefits from the latest software enhancements and security improvements. \n\n Understanding the pivotal role of security in your device's ecosystem, you will be equipped to check for and install security updates and Google Play system updates. With most updates occurring automatically, we guide you through how to ensure your device is always equipped with the most recent protections and features, keeping it secure and operating at its best."
        AndroidSettingType.DEVICE_ENCRYPTION.toString()  -> "\n\n Step into the realm of device security with the Encryption & Credentials settings, where you will learn how to enhance your Android device's security. Understand the pivotal role of encryption in safeguarding your data and explore the various types of credentials. \n\n In this section, you will find options to encrypt your phone, manage trusted and user credentials, and handle security certificates. Learning to navigate these settings allows you to ensure comprehensive protection and establish trust in your device's interactions with networks and resources."
        else -> "Unknown setting type."
    }

    val listData: List<ExpandableHeaderCardData> = when (backStackEntry) {
        AndroidSettingType.SCREEN_LOCK.toString() -> ScreenLockCardData
        AndroidSettingType.PRIVACY.toString()  -> PrivacyCardData
        AndroidSettingType.FIND_MY_DEVICE.toString()  -> FindMyDeviceCardData
        AndroidSettingType.GOOGLE_PLAY_PROTECT.toString()  -> GooglePlayProtectCardData
        AndroidSettingType.ROOT_DETECTION.toString()  -> RootDetectionCardData
        AndroidSettingType.SOFTWARE_UPDATES.toString()  -> SoftwareUpdatesCardData
        AndroidSettingType.DEVICE_ENCRYPTION.toString()  -> DeviceEncryptionCardData
        else -> DeviceEncryptionCardData
    }

    val title =  ""

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
            item { StandardText(value = "Android Settings - $backStackEntry", fontSize = 18.sp) }
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
