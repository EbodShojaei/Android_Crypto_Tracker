package com.example.projectebodshojaei

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import com.example.projectebodshojaei.data.crypto.CryptoState
import com.example.projectebodshojaei.data.user.UserRepository
import com.example.projectebodshojaei.data.user.UserState
import com.example.projectebodshojaei.ui.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cryptoRepository = (application as MyApp).cryptoRepository
        val userRepository = UserRepository()
        val userState = UserState(userRepository)

        setContent {
            val cryptoState = CryptoState(cryptoRepository)
            LaunchedEffect(cryptoState) {
                cryptoState.getCryptos()
            }

            MainScreen(userState, cryptoState)
        }
    }
}


