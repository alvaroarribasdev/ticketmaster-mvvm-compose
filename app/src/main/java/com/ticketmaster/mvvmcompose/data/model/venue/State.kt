package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class State(
    @Json(name = "name") val name: String,
    @Json(name = "stateCode") val stateCode: String,
)