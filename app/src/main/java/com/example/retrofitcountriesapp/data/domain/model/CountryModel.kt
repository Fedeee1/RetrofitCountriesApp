package com.example.retrofitcountriesapp.data.domain.model

import com.google.gson.annotations.SerializedName

data class CountryModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("capital")
    val capital: String,
    @SerializedName("href")
    val href: Any
)
