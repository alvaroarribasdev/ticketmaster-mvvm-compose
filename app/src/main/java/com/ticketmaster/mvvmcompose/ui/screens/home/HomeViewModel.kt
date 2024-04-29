package com.ticketmaster.mvvmcompose.ui.screens.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.ticketmaster.mvvmcompose.data.model.event.Event
import com.ticketmaster.mvvmcompose.domain.usecases.GetEventsByCityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor (
    private val getEventsByCityUseCase: GetEventsByCityUseCase
) : ViewModel() {

    private val _eventsByCity = MutableStateFlow<PagingData<Event>>(PagingData.empty())
    val eventsByCityState: StateFlow<PagingData<Event>> = _eventsByCity.asStateFlow()


    init {
        loadEventsByCity()
    }

    private fun loadEventsByCity() {
        viewModelScope.launch {
            getEventsByCityUseCase.execute().collectLatest { pagingData ->
                _eventsByCity.value = pagingData
            }
        }
    }
}