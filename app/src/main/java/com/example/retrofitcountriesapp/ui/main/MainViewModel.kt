package com.example.retrofitcountriesapp.ui.main

import androidx.lifecycle.ViewModel
import com.example.retrofitcountriesapp.data.domain.model.country.CountryModel
import com.example.retrofitcountriesapp.data.domain.uses_cases.GetCountriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


@HiltViewModel
class MainViewModel  @Inject constructor(private val getCountriesUseCase : GetCountriesUseCase) : ViewModel() {

    private var listCountries: List<CountryModel> = listOf()
    private var listCountriesName: MutableList<CountryModel> = mutableListOf()

    private var isLoading: Boolean = true
    var isLoadingFlow: Flow<Boolean> = flow {
        emit(isLoading)
    }

    var listCountriesFlow: Flow<List<CountryModel>> = flow {
        isLoading = true
        listCountries = getCountriesUseCase()

        for (i in listCountries){
            listCountriesName.add(i)
        }
        emit(listCountriesName)
    }
}