package com.example.retrofitcountriesapp.data.domain.repository.remote.mapper

interface RequestMapper<M, E> {
    fun toRequest(model: M): E
}