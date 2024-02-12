package com.example.retrofitcountriesapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.retrofitcountriesapp.data.domain.model.country.CountryModel
import com.example.retrofitcountriesapp.databinding.ActivityMainBinding
import com.example.retrofitcountriesapp.ui.main.adapter.RecyclerCountriesAdapter
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
                initAdapter(it)
                binding.progressLoading.isVisible = false
            }
        }
        viewModel.viewModelScope.launch {
            viewModel.isLoadingFlow.collect {
                binding.progressLoading.isVisible = it
            }
        }
    }

    private fun initAdapter(listCountries: List<CountryModel>){
        val adapter = RecyclerCountriesAdapter(listCountries)
        binding.recyclerCountries.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerCountries.adapter = adapter
    }

}