package com.example.projectebodshojaei.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.projectebodshojaei.data.crypto.CryptoState
import com.example.projectebodshojaei.data.user.UserState
import com.example.projectebodshojaei.ui.BottomNavigationBar
import com.example.projectebodshojaei.ui.main.MainContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(userState: UserState, cryptoState: CryptoState) {
    var currentScreen by remember { mutableStateOf("Home") }

    Scaffold(
        bottomBar = { BottomNavigationBar(currentScreen, onScreenChange = { currentScreen = it }) },
    ) {
        when (currentScreen) {
            "Home" -> MainContent(cryptoState)
            "Favorites" -> FavoritesScreen(userState, cryptoState)
            "Profile" -> ProfileScreen(userState)
            "Settings" -> SettingsScreen(userState)
        }
    }
}