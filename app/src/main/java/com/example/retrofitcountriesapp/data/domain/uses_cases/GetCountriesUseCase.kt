package com.example.retrofitcountriesapp.data.domain.uses_cases

import com.example.retrofitcountriesapp.commons.GET_LIST_COUNTRY_LIMIT
import com.example.retrofitcountriesapp.data.CountriesRepository
import com.example.retrofitcountriesapp.data.domain.model.country.CountryModel
import com.example.retrofitcountriesapp.data.domain.repository.remote.mapper.GetListCountryMapper
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(
    private val repository: CountriesRepository,
    private val getListPokemonResultMapper: GetListCountryMapper
) {
    suspend operator fun invoke(): List<CountryModel> = getListPokemonResultMapper.fromResponse(
        repository.getCountries(GET_LIST_COUNTRY_LIMIT)).data
}