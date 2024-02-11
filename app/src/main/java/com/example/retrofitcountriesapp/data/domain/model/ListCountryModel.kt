package com.example.retrofitcountriesapp.data.domain.model

import com.google.gson.annotations.SerializedName

data class ListCountryModel(
    @SerializedName("data")
    val data: List<CountryModel>
)