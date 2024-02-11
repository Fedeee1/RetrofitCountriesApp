package com.example.retrofitcountriesapp.data.domain.model

import com.google.gson.annotations.SerializedName

data class ListCountryModel(
    @SerializedName("results")
    val results: List<CountryModel>
)