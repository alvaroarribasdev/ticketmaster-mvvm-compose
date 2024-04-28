package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GeneralInfo(
    @Json(name = "childRule") val childRule: String,
    @Json(name = "generalRule") val generalRule: String?,
)