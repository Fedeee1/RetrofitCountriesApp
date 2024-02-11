package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

interface ResponseMapper<E, M> {
    fun fromResponse(response: E): M
}