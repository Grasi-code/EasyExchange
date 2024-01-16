package com.example.easy_exchange.data.models

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)