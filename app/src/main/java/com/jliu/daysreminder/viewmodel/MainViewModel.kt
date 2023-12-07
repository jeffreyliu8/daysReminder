package com.jliu.daysreminder.viewmodel

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
//    private val repository: MainRepository
) : ViewModel() {

    private val _uiStateFlow = MutableStateFlow(MainUiState())
    val uiStateFlow: StateFlow<MainUiState> = _uiStateFlow
}

data class MainUiState(
    val someText: String = ""
)