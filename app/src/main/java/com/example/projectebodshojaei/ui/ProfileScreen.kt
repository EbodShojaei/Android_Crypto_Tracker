package com.example.projectebodshojaei.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.projectebodshojaei.data.user.UserState

@Composable
fun ProfileScreen(userState: UserState) {
    val user = userState.currentUser
    if (user != null) {
        Text(text = "Name: ${user.name}")
        Text(text = "Email: ${user.email}")
    } else {
        Text(text = "No user logged in")
    }
}