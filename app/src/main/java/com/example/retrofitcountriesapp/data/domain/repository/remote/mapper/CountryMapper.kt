package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

import com.example.retrofitcountriesapp.data.domain.model.country.CountryModel
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse

class CountryMapper : ResponseMapper<CountryResponse, CountryModel> {
    override fun fromResponse(response: CountryResponse): CountryModel {
        return CountryModel(response.name ?: "", response.capital ?: "", response.href.flag ?: "")
    }
}