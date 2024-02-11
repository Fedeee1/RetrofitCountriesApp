package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CountryProvider @Inject constructor() {
        var pokemons: List<PokemonResponse> = emptyList()
}