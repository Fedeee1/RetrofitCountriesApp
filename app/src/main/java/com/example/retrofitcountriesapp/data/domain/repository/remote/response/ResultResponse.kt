package com.example.retrofitcountriesapp.data.domain.repository.remote.response

import com.example.retrofitcountriesapp.data.domain.repository.remote.response.PokemonResponse
import com.google.gson.annotations.SerializedName

data class ResultResponse (
    @SerializedName("results")
    val results : List<PokemonResponse>,
    @SerializedName("totalResult")
    val totalResult: Int
)