package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Links(
    @Json(name = "self") val self: Self?,
    @Json(name = "venues") val venues: List<Venue2>?,
    @Json(name = "attractions") val attractions: List<Attraction2>?,
)