package com.base_project.base_mvvm_kt.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(@SerializedName("quote") val quote: String,
                      @SerializedName("author") val author: String)
