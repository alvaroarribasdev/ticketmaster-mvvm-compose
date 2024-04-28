package com.ticketmaster.mvvmcompose.data.remote.api.event

import com.ticketmaster.mvvmcompose.data.model.event.EventsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface EventsApi {
    @GET("events")
    suspend fun getEventsByCity(
        @Query("page") page: Int,
        @Query("sort") sort: String,
        @Query("locale") locale: String,
        @Query("city") city: String,
    ): EventsResponse

    /* @GET("events/{event_id}/images")
    fun getEventImages(
        @Path("event_id") eventId: String
    ): Call<ImagesResponse> */

    /* @GET("events")
    suspend fun getEventsByDistance(
        @Query("page") page: Int,
        @Query("sort") sort: String,
        @Query("locale") locale: String,
        @Query("geoPoint") geoPoint: String,
        @Query("radius") radius: String,
        @Query("unit") unit: String,
        @Query("genreId") genreId: String,
    ): <EmbeddedResponse<EventsResponse>> */

    /* @GET("events")
    suspend fun getEventsByVenue(
        @Query("page") page: Int,
        @Query("locale") locale: String,
        @Query("venueId") venueId: String,
    ): EventsResponse */
}