package com.base_project.base_mvvm_kt.domain

import com.base_project.base_mvvm_kt.data.QuoteRepository
import com.base_project.base_mvvm_kt.data.model.QuoteModel
import com.base_project.base_mvvm_kt.data.model.QuoteProvider

class GetRandomQuoteUseCase {


    operator fun invoke(): QuoteModel?{
        val quotes= QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber= (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}