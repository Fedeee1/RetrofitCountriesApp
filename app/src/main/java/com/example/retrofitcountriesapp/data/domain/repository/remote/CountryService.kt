package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.core.RetrofitService
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CountryService @Inject constructor (){
    private val service = RetrofitService.makeRetrofitService()
    private val token = "522|7ZerAJBeWAtlH9dNMjukOCa2DinknXskMZLe2vMF"
    suspend fun getPokemons(limit: Int, offset: Int): List<CountryResponse> {
        return withContext(Dispatchers.IO) {
            val response = service.create(CountryApiClient::class.java).getListCountries("Bearer $token", limit, offset)
            response.body()?.data ?: emptyList()
        }
    }

}