package com.ticketmaster.mvvmcompose.data.paging.event

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.ticketmaster.mvvmcompose.data.model.event.Event
import com.ticketmaster.mvvmcompose.data.remote.api.event.EventsApi
import okio.IOException
import retrofit2.HttpException

class EventsByCitySource(private val api: EventsApi) :
    PagingSource<Int, Event>() {
    override fun getRefreshKey(state: PagingState<Int, Event>): Int? = state.anchorPosition

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Event> {
        return try {
            val nextPage = params.key ?: 1

            val eventsByCityResponse = api.getEventsByCity(nextPage, "date,asc", "*", "New York")

            LoadResult.Page(
                data = eventsByCityResponse.embedded.events,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (eventsByCityResponse.embedded.events.isEmpty()) null else eventsByCityResponse.page.number + 1
            )
        } catch (e: IOException) {
            return LoadResult.Error(e)
        } catch (e: HttpException) {
            return LoadResult.Error(e)
        }
    }
}