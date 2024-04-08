package com.example.cs492.components

import android.content.Intent
import android.provider.Settings
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cs492.Screen
import com.example.cs492.util.ImageType


data class ScreenButton (val page: Screen, val buttonText: String)
data class LinkButton (val link: String, val buttonText: String)

data class ExpandableHeaderCardData(
    val headerText: String,
    val icon: ImageType,
    val iconContentDescription: String,
    val descriptionText: String? = null,
    val pageData: ScreenButton? = null,
    val linkData: LinkButton? = null,
    val annotatedText: AnnotatedString? = null
)

@Composable
fun ExpandableCard(
    navController: NavController,
    cardData: ExpandableHeaderCardData,
) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .animateContentSize(),
        shape = RoundedCornerShape(8.dp),
        colors = cardColors(containerColor = Color.Black)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clickable { expanded = !expanded }
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = cardData.icon.resolveImage(),
                    contentDescription = cardData.iconContentDescription,
                    modifier = Modifier.size(24.dp),
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = cardData.headerText,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                cardData.descriptionText?.let {
                    Text(
                        text = cardData.descriptionText,
                        color = Color.White
                    )
                }

                cardData.annotatedText?.let {
                    ClickableText(
                        text = it,
                        style = TextStyle(color = Color.White, fontSize = 16.sp),
                        onClick = { offset ->
                            it.getStringAnnotations(tag = "URL", start = offset, end = offset)
                                .firstOrNull()?.let { annotation ->
                                    var intent = Intent(Settings.ACTION_SETTINGS)
                                    when (annotation.item) {
                                        "settings_lockscreen_security" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                        "settings_lockscreen_notifications" -> {
                                            intent = Intent(Settings.ACTION_SETTINGS)
                                        }
                                        "settings_privacy_permission_manager" -> {
                                            intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                                        }
                                        "settings_privacy_dashboard" -> {
                                            intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                                        }
                                        "settings_privacy_controls" -> {
                                            intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                                        }
                                        "settings_privacy_special_access" -> {
                                            intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                                        }
                                        "settings_privacy_ads" -> {
                                            intent = Intent(Settings.ACTION_SETTINGS)
                                        }
                                        "settings_location" -> {
                                            intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                                        }
                                        "settings_security" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                        "settings_google_account" -> {
                                            intent = Intent(Settings.ACTION_SYNC_SETTINGS)
                                        }
                                        "settings_about" -> {
                                            intent = Intent(Settings.ACTION_DEVICE_INFO_SETTINGS)
                                        }
                                        "settings_play_protect" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                        "settings_system_update" -> {
                                            intent = Intent(Settings.ACTION_SETTINGS)
                                        }
                                        "settings_system_updates" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                        "settings_security_trust_credentials" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                        "settings_security_user_credentials" -> {
                                            intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                                        }
                                    }

                                    context.startActivity(intent)
                                }
                        },
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                cardData.pageData?.let {
                    TertiaryButton(
                        onClick = { navController.navigate(it.page.route) },
                        text = it.buttonText
                    )
                }
                cardData.linkData?.let {
                    TertiaryButton(
                        onClick = { uriHandler.openUri(it.link) },
                        text = it.buttonText
                    )
                }
            }
        }
    }
}
