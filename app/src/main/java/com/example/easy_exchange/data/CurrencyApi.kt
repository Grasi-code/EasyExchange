package com.example.easy_exchange.data

import com.example.easy_exchange.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/v1/latest?access_key=9d32c0debe02ecca6132f33e5479b389")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}