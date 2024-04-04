package com.example.projectebodshojaei.data.crypto

import com.google.gson.annotations.SerializedName

const val DEFAULT: String = "n/a"

data class Cryptos(
    @SerializedName("data")
    val tokens: List<Token>
)

data class Token(
    val id: String,
    val rank: String? = DEFAULT,
    val symbol: String,
    val name: String,
    val supply: String? = DEFAULT,
    val maxSupply: String? = DEFAULT,
    val marketCapUsd: String? = DEFAULT,
    val volumeUsd24Hr: String? = DEFAULT,
    val priceUsd: String? = DEFAULT,
    val changePercent24Hr: String? = DEFAULT,
    @SerializedName("vwap24Hr")
    val swap24Hr: String? = DEFAULT,
    val explorer: String? = DEFAULT,
    val timestamp: String? = DEFAULT
)