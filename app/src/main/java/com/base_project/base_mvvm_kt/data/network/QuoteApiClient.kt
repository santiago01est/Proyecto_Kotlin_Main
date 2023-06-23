package com.base_project.base_mvvm_kt.data.network

import com.base_project.base_mvvm_kt.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun  getAllQuotes(): Response<List<QuoteModel>>
}