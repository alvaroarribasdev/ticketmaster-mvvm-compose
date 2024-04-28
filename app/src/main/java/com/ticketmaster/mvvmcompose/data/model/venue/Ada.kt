package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Ada(
    @Json(name = "adaPhones") val adaPhones: String,
    @Json(name = "adaCustomCopy") val adaCustomCopy: String,
    @Json(name = "adaHours") val adaHours: String,
)