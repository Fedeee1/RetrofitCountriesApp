package com.example.retrofitcountriesapp.data.domain.model.country

import com.example.retrofitcountriesapp.data.domain.model.BaseModel
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CountryModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("capital")
    val capital: String,
    @SerializedName("href")
    val href: String
): BaseModel()