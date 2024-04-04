package com.example.projectebodshojaei.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigationBar(currentScreen: String, onScreenChange: (String) -> Unit) {
    val items = listOf(
        Pair("Home", Icons.Filled.Home),
        Pair("Favorites", Icons.Filled.Favorite),
        Pair("Profile", Icons.Filled.Person),
        Pair("Settings", Icons.Filled.Settings)
    )

    NavigationBar {
        items.forEach { (item, icon) ->
            NavigationBarItem(
                icon = { Icon(icon, contentDescription = item) },
                label = { Text(item) },
                selected = currentScreen == item,
                onClick = { onScreenChange(item) }
            )
        }
    }
}