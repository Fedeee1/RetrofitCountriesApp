package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

import com.example.retrofitcountriesapp.data.domain.model.CountryModel
import com.example.retrofitcountriesapp.data.domain.model.ListCountryModel
import com.example.retrofitcountriesapp.data.domain.repository.remote.response.CountryResponse
import javax.inject.Inject

class GetListCountryMapper @Inject constructor():
    ResponseMapper<List<CountryResponse>, ListCountryModel> {
    override fun fromResponse(listCountryResponse: List<CountryResponse>): ListCountryModel {

        val resultModel = mutableListOf<CountryModel>()

        if (!listCountryResponse.isNullOrEmpty()) {
            val countryMapper = CountryMapper()
            listCountryResponse.forEach { getListCountryResponse ->
                resultModel.add(countryMapper.fromResponse(getListCountryResponse))
            }
        }

        return ListCountryModel(
            resultModel
        )
    }
}