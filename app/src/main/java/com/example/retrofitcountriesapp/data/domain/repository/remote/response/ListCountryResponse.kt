package com.example.retrofitcountriesapp.data.domain.repository.remote.response

import com.google.gson.annotations.SerializedName

data class ListCountryResponse (
    @SerializedName("data")
    val data : List<CountryResponse>
)