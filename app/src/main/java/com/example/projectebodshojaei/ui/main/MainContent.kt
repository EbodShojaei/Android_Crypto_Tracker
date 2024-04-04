package com.example.projectebodshojaei.ui.main

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.projectebodshojaei.data.crypto.CryptoState
import com.example.projectebodshojaei.ui.CryptoCard

@Composable
fun MainContent(cryptoState: CryptoState) {
    LazyColumn {
        items(cryptoState.cryptos) { token ->
            CryptoCard(token = token, onFavoriteClick = { tokenId ->
                // Handle favorite click here
                println("Favorite clicked for token with id: $tokenId")
            })
        }
    }
}