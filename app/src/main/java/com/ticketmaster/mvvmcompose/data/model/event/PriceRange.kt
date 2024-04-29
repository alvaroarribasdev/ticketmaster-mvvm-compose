package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PriceRange(
    @Json(name = "currency") val currency: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "min") val min: Double?,
    @Json(name = "max") val max: Double?,
)