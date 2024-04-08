package com.example.cs492.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Store
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Store
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.cs492.DrawerItem
import com.example.cs492.R
import com.example.cs492.Screen
import com.example.cs492.firebaseauth.viewmodels.NavigationDrawerViewModel
import com.example.cs492.util.ImageType
import kotlinx.coroutines.launch

val DRAWER_ITEMS: List<DrawerItem> = listOf(
    DrawerItem(
        label = "Home",
        iconSelected = ImageType.Vector(Icons.Filled.Home),
        iconUnselected = ImageType.Vector(Icons.Outlined.Home),
        screen = Screen.Home,
    ),
    DrawerItem(
        label = "App Permissions",
        iconSelected = ImageType.Vector(Icons.Filled.Lock),
        iconUnselected = ImageType.Vector(Icons.Outlined.Lock),
        screen = Screen.AppPermission,
    ),
    DrawerItem(
        label = "Security Settings WalkThrough",
        iconSelected = ImageType.Vector(Icons.Filled.Settings),
        iconUnselected =  ImageType.Vector(Icons.Outlined.Settings),
        screen = Screen.AndroidSettings,
    ),
    DrawerItem(
        label = "Blog Section",
        iconSelected = ImageType.Vector(Icons.AutoMirrored.Filled.Chat),
        iconUnselected = ImageType.Vector(Icons.AutoMirrored.Outlined.Chat),
        screen = Screen.BlogSection,
    ),
    DrawerItem(
        label = "App Marketplaces",
        iconSelected = ImageType.Vector(Icons.Filled.Store),
        iconUnselected = ImageType.Vector(Icons.Outlined.Store),
        screen = Screen.AppMarketplace,
    ),
    DrawerItem(
        label = "Logout",
        iconSelected = ImageType.Vector(Icons.Filled.Logout),
        iconUnselected = ImageType.Vector(Icons.Outlined.Logout),
        screen = Screen.Login,
    ),
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerWrapper(
    children:  @Composable (() -> Unit),
    navController: NavHostController,
    itemIndex: Int,
    viewModel: NavigationDrawerViewModel = hiltViewModel()
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                DRAWER_ITEMS.forEachIndexed { index, item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.label) },
                        selected = index == itemIndex,
                        onClick = {
                            if(item.label == "logout") { scope.launch { viewModel.logoutUser() }}
                            navController.navigate(item.screen.route)
                            scope.launch {
                                drawerState.close()
                            }
                        },
                        icon = {
                            Icon(
                                imageVector =
                                if (index == itemIndex) {
                                    item.iconSelected.resolveImage()
                                } else {
                                    item.iconUnselected.resolveImage()
                                },
                                contentDescription = item.label
                            )
                        },
                        modifier = Modifier
                            .padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            topBar = {
                TopAppBar(
                    title = {
                        Row {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = R.drawable.privacy_tip_24),
                                contentDescription = "Menu",
                                modifier = Modifier.padding(2.dp)
                            )
                            Text(
                                text = DRAWER_ITEMS[itemIndex].label,
                                fontSize = 20.sp
                            )
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu"
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)){
                children()
            }
        }
    }
}