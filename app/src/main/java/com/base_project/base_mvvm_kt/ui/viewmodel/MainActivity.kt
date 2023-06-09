package com.base_project.base_mvvm_kt.ui.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uniquindio.base_mvvm_kt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // LiveData binding var
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}