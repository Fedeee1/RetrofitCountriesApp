package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.core.RetrofitService
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CountryService @Inject constructor (){
    private val service = RetrofitService.makeRetrofitService()

    suspend fun getPokemons(limit: Int, offset: Int): List<PokemonResponse> {
        return withContext(Dispatchers.IO) {
            val response = service.create(CountryApiClient::class.java).getListPokemon(limit, offset)
            response.body()?.results ?: emptyList()
        }
    }

}