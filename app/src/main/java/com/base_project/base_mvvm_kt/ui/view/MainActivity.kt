package com.base_project.base_mvvm_kt.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.base_project.base_mvvm_kt.ui.viewmodel.QuoteViewModel
import com.uniquindio.base_mvvm_kt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // LiveData binding var
    private lateinit var binding:ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text=it.quote
            binding.tvAuthor.text=it.author
        })

        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote()}
    }
}