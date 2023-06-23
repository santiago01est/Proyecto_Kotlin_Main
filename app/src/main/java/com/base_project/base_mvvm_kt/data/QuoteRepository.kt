package com.base_project.base_mvvm_kt.data

import com.base_project.base_mvvm_kt.data.model.QuoteModel
import com.base_project.base_mvvm_kt.data.model.QuoteProvider
import com.base_project.base_mvvm_kt.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}