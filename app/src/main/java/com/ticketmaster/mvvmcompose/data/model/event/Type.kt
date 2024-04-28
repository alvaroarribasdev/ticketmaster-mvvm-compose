package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Type(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String,
)