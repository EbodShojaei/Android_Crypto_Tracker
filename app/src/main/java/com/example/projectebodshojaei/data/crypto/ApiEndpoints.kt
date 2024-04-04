package com.example.projectebodshojaei.data.crypto

/**
 * Enum class to define the API endpoints of the CoinCap API
 * @property url the URL of the endpoint
 * @constructor Create empty Api endpoints
 * @param url the URL of the endpoint
 */
enum class ApiEndpoints(val url: String) {
    BASE_URL("https://api.coincap.io/v2"),
    ASSETS("${BASE_URL.url}/assets");

    /**
     * Get the history of an asset
     * @param id the ID of the asset
     * @param interval the interval of the history
     * @return the URL of the history endpoint
     */
    fun withHistory(id: String, interval: Intervals = Intervals.D1): String {
        return when (this) {
            ASSETS -> "${url}/$id/history?interval=${interval.time}"
            else -> url
        }
    }
}
