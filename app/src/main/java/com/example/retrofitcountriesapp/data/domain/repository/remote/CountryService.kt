package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.core.RetrofitClient
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


const val TOKEN = "522|7ZerAJBeWAtlH9dNMjukOCa2DinknXskMZLe2vMF"
class CountryService @Inject constructor (){

    private val service = RetrofitClient.makeRetrofitService()
    suspend fun getPokemons(limit: Int, offset: Int): List<CountryResponse> {
        return withContext(Dispatchers.IO) {
            val response = service.create(RemoteApiService::class.java).getListCountries("Bearer $TOKEN", limit, offset)
            response.body()?.data ?: emptyList()
        }
    }

}