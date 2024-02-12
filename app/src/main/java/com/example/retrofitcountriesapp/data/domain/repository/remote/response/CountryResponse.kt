package com.example.retrofitcountriesapp.data.domain.repository.remote.response

import com.google.gson.annotations.SerializedName

data class CountryResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("capital")
    val capital: String,
    @SerializedName("href")
    val href: HrefXResponse
)
