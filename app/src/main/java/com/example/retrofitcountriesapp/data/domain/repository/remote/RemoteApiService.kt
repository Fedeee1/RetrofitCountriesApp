package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.data.domain.repository.remote.response.ListCountryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RemoteApiService {
    @GET("countries")
    suspend fun getListCountries(
        @Header("Authorization") token: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
    ): Response<ListCountryResponse>
}