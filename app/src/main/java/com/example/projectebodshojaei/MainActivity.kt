package com.example.projectebodshojaei

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import com.example.projectebodshojaei.data.CryptoState
import com.example.projectebodshojaei.ui.main.MainContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cryptoRepository = (application as MyApp).cryptoRepository

        setContent {
            val cryptoState = CryptoState(cryptoRepository)
            LaunchedEffect(cryptoState) {
                cryptoState.getCryptos()
            }

            MainContent(cryptoState)
        }
    }
}


