package com.example.retrofitcountriesapp.data.domain.model.country

import com.example.retrofitcountriesapp.data.domain.model.BaseModel
import com.example.retrofitcountriesapp.data.domain.model.country.CountryModel
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListCountryModel(
    @SerializedName("data")
    val data: List<CountryModel>
) : BaseModel()