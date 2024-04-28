package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Accessibility(
    @Json(name = "info") val info: String?,
    @Json(name = "ticketLimit") val ticketLimit: Long?,
    @Json(name = "id") val id: String?,
)