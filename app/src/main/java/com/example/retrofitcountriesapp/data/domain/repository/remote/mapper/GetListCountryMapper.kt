package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

import com.example.retrofitcountriesapp.data.domain.model.CountryModel
import com.example.retrofitcountriesapp.data.domain.model.ListCountryModel
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse
import javax.inject.Inject

class GetListCountryMapper @Inject constructor():
    ResponseMapper<List<PokemonResponse>, ListCountryModel> {
    override fun fromResponse(listPokemonResponse: List<PokemonResponse>): ListCountryModel {

        val resultModel = mutableListOf<CountryModel>()

        if (!listPokemonResponse.isNullOrEmpty()) {
            val pokemonMapper = CountryMapper()
            listPokemonResponse.forEach { getListPokemonResultResponse ->
                resultModel.add(pokemonMapper.fromResponse(getListPokemonResultResponse))
            }
        }

        return ListCountryModel(
            resultModel
        )
    }
}