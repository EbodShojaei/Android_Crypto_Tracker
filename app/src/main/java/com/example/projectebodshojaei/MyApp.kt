package com.example.projectebodshojaei

import android.app.Application
import com.example.projectebodshojaei.data.CryptoRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.gson.gson

class MyApp: Application() {
    val client = HttpClient {
        install(ContentNegotiation) {
            gson()
        }
    }

    val cryptoRepository = CryptoRepository(client)
}