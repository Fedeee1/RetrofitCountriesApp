package com.example.retrofitcountriesapp.data

import com.example.retrofitcountriesapp.data.domain.repository.remote.CountryProvider
import com.example.retrofitcountriesapp.data.domain.repository.remote.CountryService
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse
import javax.inject.Inject


class CountriesRepository @Inject constructor(private val api: CountryService, private val pokemonProvider: CountryProvider) {

    suspend fun getCountries(limit: Int) : List<CountryResponse>{
        val response = api.getCountries(limit)
        pokemonProvider.countries = response
        return response
    }

}

