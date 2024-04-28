package com.ticketmaster.mvvmcompose.domain.usecases

import androidx.paging.PagingData
import com.ticketmaster.mvvmcompose.data.model.event.Event
import com.ticketmaster.mvvmcompose.data.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetEventsByCityUseCase @Inject constructor(private val eventsRepository: EventRepository) {

    fun execute(): Flow<PagingData<Event>> {
        return eventsRepository.getEventsByCity()
    }
}