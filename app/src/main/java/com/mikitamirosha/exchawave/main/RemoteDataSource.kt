package com.mikitamirosha.exchawave.main

interface RemoteDataSource {
    suspend fun getItems(): List<Item>
}