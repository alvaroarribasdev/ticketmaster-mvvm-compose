package com.ticketmaster.mvvmcompose.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.ticketmaster.mvvmcompose.data.model.event.Event

@JsonClass(generateAdapter = true)
data class Embedded(
    @Json(name = "events") val events: List<Event>,
)