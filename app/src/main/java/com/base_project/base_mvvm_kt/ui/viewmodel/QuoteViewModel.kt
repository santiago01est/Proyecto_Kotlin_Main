package com.base_project.base_mvvm_kt.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.base_project.base_mvvm_kt.data.model.QuoteModel
import com.base_project.base_mvvm_kt.data.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel=MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}