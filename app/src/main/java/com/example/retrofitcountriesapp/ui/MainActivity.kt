package com.example.retrofitcountriesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import com.example.retrofitcountriesapp.R
import com.example.retrofitcountriesapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewModel()
    }

    private fun setupViewModel(){
        viewModel.viewModelScope.launch {
            viewModel.listCountriesFlow.collect {
                println("Lista: $it")
                binding.progressLoading.isVisible = false
            }
        }
        viewModel.viewModelScope.launch {
            viewModel.isLoadingFlow.collect {
                binding.progressLoading.isVisible = it
            }
        }
    }
}