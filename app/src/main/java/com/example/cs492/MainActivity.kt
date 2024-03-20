package com.example.cs492

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.example.cs492.ui.theme.CS492Theme
import com.example.cs492.util.ImageType
import dagger.hilt.android.AndroidEntryPoint

data class DrawerItem(
    val label: String,
    val iconSelected: ImageType,
    val iconUnselected: ImageType,
    val screen: Screen
)

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val loggedIn: Boolean = viewModel.getLoggedInStatus()
            val currentUserName = viewModel.getCurrentUserName()
            val context = LocalContext.current

            if(currentUserName != null) {
                Toast.makeText(context, "Welcome back: $currentUserName", Toast.LENGTH_SHORT)
            }
            CS492Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    Navigation(
                        loggedIn = loggedIn,
                        modifier = Modifier.padding(),
                        navController = navController
                    )
                }
            }
        }
    }
}