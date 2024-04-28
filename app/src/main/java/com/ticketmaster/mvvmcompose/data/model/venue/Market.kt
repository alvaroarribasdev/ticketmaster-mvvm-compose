package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Market(
    @Json(name = "name") val name: String,
    @Json(name = "id") val id: String,
)