package com.example.retrofitcountriesapp.data.domain.model.country

import com.example.retrofitcountriesapp.data.domain.model.BaseModel
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class HrefXModel(
    @SerializedName("flag")
    val flag: String
) : BaseModel()