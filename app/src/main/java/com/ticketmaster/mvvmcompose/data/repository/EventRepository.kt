package com.ticketmaster.mvvmcompose.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.ticketmaster.mvvmcompose.data.model.event.Event
import com.ticketmaster.mvvmcompose.data.paging.event.EventsByCitySource
import com.ticketmaster.mvvmcompose.data.remote.api.event.EventsApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EventRepository @Inject constructor(private val api: EventsApi) {

    fun getEventsByCity(): Flow<PagingData<Event>> {
        return Pager(
            config = PagingConfig(pageSize = EVENT_BY_CITY_PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = { EventsByCitySource(api) }
        ).flow
    }

    companion object {
        private const val EVENT_BY_CITY_PAGE_SIZE = 20
    }
}