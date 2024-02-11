package com.example.retrofitcountriesapp.data

import com.example.retrofitcountriesapp.data.domain.repository.remote.CountryProvider
import com.example.retrofitcountriesapp.data.domain.repository.remote.CountryService
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse
import javax.inject.Inject


class CountriesRepository @Inject constructor(private val api: CountryService, private val pokemonProvider: CountryProvider) {

    suspend fun getPokemons(limit: Int, offset: Int) : List<PokemonResponse>{
        val response = api.getPokemons(limit, offset)
        pokemonProvider.pokemons = response
        return response
    }

}

