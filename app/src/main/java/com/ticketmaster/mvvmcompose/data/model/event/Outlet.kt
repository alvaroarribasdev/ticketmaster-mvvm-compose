package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Outlet(
    @Json(name = "url") val url: String?,
    @Json(name = "type") val type: String?,
)