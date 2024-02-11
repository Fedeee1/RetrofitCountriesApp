package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.commons.TOKEN
import com.example.retrofitcountriesapp.core.RetrofitService
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
class CountryService @Inject constructor (){
    private val service = RetrofitService.makeRetrofitService()
    suspend fun getPokemons(limit: Int, offset: Int): List<CountryResponse> {
        return withContext(Dispatchers.IO) {
            val response = service.create(CountryApiClient::class.java).getListCountries("Bearer $TOKEN", limit, offset)
            response.body()?.data ?: emptyList()
        }
    }

}