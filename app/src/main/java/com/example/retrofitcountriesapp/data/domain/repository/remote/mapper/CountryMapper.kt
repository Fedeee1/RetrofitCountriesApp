package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

import com.example.retrofitcountriesapp.data.domain.model.CountryModel
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse

class CountryMapper : ResponseMapper<PokemonResponse, CountryModel> {
    override fun fromResponse(response: PokemonResponse): CountryModel {
        return CountryModel(response.name ?: "", response.url ?: "")
    }
}