package com.base_project.base_mvvm_kt.domain

import com.base_project.base_mvvm_kt.data.QuoteRepository
import com.base_project.base_mvvm_kt.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}