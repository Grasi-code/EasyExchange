package com.example.easy_exchange.main

import com.example.easy_exchange.data.CurrencyApi
import com.example.easy_exchange.data.models.CurrencyResponse
import com.example.easy_exchange.util.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi

) : MainRepository{
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
       return try {
           val response = api.getRates(base)
           val result = response.body()
           if(response.isSuccessful && result != null){
               Resource.Success(result)
           }else{
               Resource.Error(response.message())
           }
       } catch (e: Exception){
           Resource.Error(e.message ?: "An error occured")
       }
    }
}