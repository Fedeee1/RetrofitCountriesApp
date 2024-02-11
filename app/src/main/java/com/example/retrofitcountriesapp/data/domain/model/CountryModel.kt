package com.example.retrofitcountriesapp.data.domain.model

import com.google.gson.annotations.SerializedName

data class CountryModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)
