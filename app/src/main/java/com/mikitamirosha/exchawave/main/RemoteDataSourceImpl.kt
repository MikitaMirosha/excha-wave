package com.mikitamirosha.exchawave.main

class RemoteDataSourceImpl(private val apiService: ApiService) : RemoteDataSource {
    override suspend fun getItems(): List<Item> {
        return apiService.getItems()
    }
}