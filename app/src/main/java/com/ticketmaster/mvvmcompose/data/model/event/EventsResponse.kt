package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.ticketmaster.mvvmcompose.data.model.Embedded
import com.ticketmaster.mvvmcompose.data.model.Links4
import com.ticketmaster.mvvmcompose.data.model.Page

@JsonClass(generateAdapter = true)
data class EventsResponse(
    @Json(name = "_embedded") val embedded: Embedded,
    @Json(name = "_links") val links: Links4,
    @Json(name = "page") val page: Page,
)