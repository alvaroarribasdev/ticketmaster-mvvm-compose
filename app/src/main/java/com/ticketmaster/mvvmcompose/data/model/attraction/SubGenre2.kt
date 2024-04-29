package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SubGenre2(
    @Json(name = "id") val id: String?,
    @Json(name = "name") val name: String?,
)