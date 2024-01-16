package com.example.easy_exchange.main

import com.example.easy_exchange.data.models.CurrencyResponse
import com.example.easy_exchange.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}