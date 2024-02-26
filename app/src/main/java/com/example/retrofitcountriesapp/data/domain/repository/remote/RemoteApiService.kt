package com.example.retrofitcountriesapp.data.domain.repository.remote

import com.example.retrofitcountriesapp.data.domain.repository.remote.response.ListCountryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface RemoteApiService {
    @GET("countries")
    suspend fun getListCountries(
        @Header("Authorization") token: String
    ): Response<ListCountryResponse>

    @GET("countries?per_page={limit}")
    suspend fun getListCountriesLimit(
        @Header("Authorization") token: String,
        @Path("limit") limit : Int
    ): Response<ListCountryResponse>

    @GET("countries?continent={continent}")
    suspend fun getListCountriesByContinent(
        @Header("Authorization") token: String,
        @Path("continent") continent : String
    ): Response<ListCountryResponse>
}