package com.ticketmaster.mvvmcompose.di

import com.ticketmaster.mvvmcompose.data.remote.api.event.EventsApi
import com.ticketmaster.mvvmcompose.data.repository.EventRepository
import com.ticketmaster.mvvmcompose.domain.usecases.GetEventsByCityUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideEventRepository(api: EventsApi): EventRepository {
        return EventRepository(api)
    }

    @Provides
    fun provideGetEventsByCityUseCase(eventRepository: EventRepository): GetEventsByCityUseCase {
        return GetEventsByCityUseCase(eventRepository)
    }
}