package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Public(
    @Json(name = "startDateTime") val startDateTime: String,
    @Json(name = "startTBD") val startTbd: Boolean,
    @Json(name = "startTBA") val startTba: Boolean,
    @Json(name = "endDateTime") val endDateTime: String,
)