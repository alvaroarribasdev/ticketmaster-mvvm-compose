package com.ticketmaster.mvvmcompose.ui.screens.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.ticketmaster.mvvmcompose.data.model.event.Event
import com.ticketmaster.mvvmcompose.domain.usecases.GetEventsByCityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor (
    private val getEventsByCityUseCase: GetEventsByCityUseCase
) : ViewModel() {

    private var _upcomingEvents = mutableStateOf<Flow<PagingData<Event>>>(emptyFlow())
    val upcomingEventsState: State<Flow<PagingData<Event>>> = _upcomingEvents


    init {
        loadEventsByCity()
    }

    private fun loadEventsByCity() {
        viewModelScope.launch {
            getEventsByCityUseCase.execute().collectLatest { pagingData ->
                _upcomingEvents.value = flow { emit(pagingData) }
            }
        }
    }
}