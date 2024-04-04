package com.example.projectebodshojaei.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.projectebodshojaei.data.user.UserState

@Composable
fun SettingsScreen(userState: UserState) {
    var name by remember { mutableStateOf(userState.currentUser?.name ?: "") }
    var email by remember { mutableStateOf(userState.currentUser?.email ?: "") }
    var password by remember { mutableStateOf(userState.currentUser?.password ?: "") }

    Column {
        TextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
        TextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        TextField(value = password, onValueChange = { password = it }, label = { Text("Password") })
        Button(onClick = {
            val user = userState.currentUser
            if (user != null) {
                userState.updateUser(user.copy(name = name, email = email, password = password))
            }
        }) {
            Text("Update")
        }
    }
}