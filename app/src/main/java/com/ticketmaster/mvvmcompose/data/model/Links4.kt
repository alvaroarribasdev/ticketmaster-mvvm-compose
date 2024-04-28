package com.ticketmaster.mvvmcompose.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Links4(
    @Json(name = "first") val first: First,
    @Json(name = "self") val self: Self4,
    @Json(name = "next") val next: Next,
    @Json(name = "last") val last: Last,
)