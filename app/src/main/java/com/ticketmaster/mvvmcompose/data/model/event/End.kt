package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class End(
    @Json(name = "localTime") val localTime: String?,
    @Json(name = "dateTime") val dateTime: String?,
    @Json(name = "approximate") val approximate: Boolean,
    @Json(name = "noSpecificTime") val noSpecificTime: Boolean,
    @Json(name = "localDate") val localDate: String?,
)