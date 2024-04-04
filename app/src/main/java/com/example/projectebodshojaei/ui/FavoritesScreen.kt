package com.example.projectebodshojaei.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.projectebodshojaei.data.crypto.CryptoState
import com.example.projectebodshojaei.data.user.UserState

@Composable
fun FavoritesScreen(userState: UserState, cryptoState: CryptoState) {
    val favorites = userState.currentUser?.favorites ?: emptyList()
    val favoriteTokens = cryptoState.cryptos.filter { it.id in favorites }

    LazyColumn {
        items(favoriteTokens) { token ->
            CryptoCard(token = token, onFavoriteClick = {
                userState.toggleFavorite(it)
            })
        }
    }
}