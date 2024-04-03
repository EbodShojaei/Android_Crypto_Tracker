package com.example.projectebodshojaei.data

import com.google.gson.Gson
import com.google.gson.JsonObject
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class CryptoRepository(private val client: HttpClient) {
    suspend fun getCryptos(): Cryptos {
        val response = client.get(ApiEndpoints.ASSETS.url)

        val json = response.body<JsonObject>().toString()
        return deserializeJson(json)
    }

    private fun deserializeJson(json: String): Cryptos {
        return Gson().fromJson(json, Cryptos::class.java)
    }

}
