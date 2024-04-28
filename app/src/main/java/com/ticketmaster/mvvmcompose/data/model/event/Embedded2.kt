package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.ticketmaster.mvvmcompose.data.model.attraction.Attraction
import com.ticketmaster.mvvmcompose.data.model.venue.Venue

@JsonClass(generateAdapter = true)
data class Embedded2(
    @Json(name = "venues") val venues: List<Venue>,
    @Json(name = "attractions") val attractions: List<Attraction>?,
)