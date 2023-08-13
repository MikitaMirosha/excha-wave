package com.mikitamirosha.exchawave.main

import retrofit2.http.GET

interface ApiService {
    @GET("/items")
    suspend fun getItems(): List<ItemResponse>
}

data class ItemResponse(
    val id: Int,
    val name: String,
    // Other properties...
)