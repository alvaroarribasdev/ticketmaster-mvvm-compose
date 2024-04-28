package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllInclusivePricing(
    @Json(name = "enabled") val enabled: Boolean,
)