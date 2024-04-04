package com.example.projectebodshojaei.data.crypto

import androidx.compose.runtime.mutableStateListOf

class CryptoState(private val cryptosRepository: CryptoRepository) {
    var cryptos = mutableStateListOf<Token>()

    suspend fun getCryptos() {
        cryptos.also {
            it.clear()
            it.addAll(cryptosRepository.getCryptos().tokens)
        }
    }

    fun getHistory(index: Int, interval: Intervals = Intervals.D1): String {
        return ApiEndpoints.ASSETS.withHistory(cryptos[index].id, interval)
    }
}