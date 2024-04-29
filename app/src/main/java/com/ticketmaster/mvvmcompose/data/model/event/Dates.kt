package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Dates(
    @Json(name = "start") val start: Start?,
    @Json(name = "end") val end: End?,
    @Json(name = "timezone") val timezone: String?,
    @Json(name = "status") val status: Status?,
    @Json(name = "spanMultipleDays") val spanMultipleDays: Boolean?,
    @Json(name = "access") val access: Access?,
)