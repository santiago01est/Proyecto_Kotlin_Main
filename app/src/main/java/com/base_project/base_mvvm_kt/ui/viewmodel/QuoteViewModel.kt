package com.base_project.base_mvvm_kt.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.base_project.base_mvvm_kt.data.model.QuoteModel
import com.base_project.base_mvvm_kt.data.model.QuoteProvider
import com.base_project.base_mvvm_kt.domain.GetQuotesUseCase
import com.base_project.base_mvvm_kt.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel:ViewModel() {
    val quoteModel=MutableLiveData<QuoteModel>()

    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase= GetQuotesUseCase()
    var getRandomQuoteUseCase= GetRandomQuoteUseCase()


    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)
        val quote= getRandomQuoteUseCase()
        if(quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}