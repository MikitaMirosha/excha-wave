package com.mikitamirosha.exchawave.main

class Repository(private val remoteDataSource: RemoteDataSource) {
    suspend fun getItems(): List<Item> {
        return remoteDataSource.getItems()
    }
}