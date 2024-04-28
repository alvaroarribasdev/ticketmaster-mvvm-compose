package com.ticketmaster.mvvmcompose.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Last(
    @Json(name = "href") val href: String,
)