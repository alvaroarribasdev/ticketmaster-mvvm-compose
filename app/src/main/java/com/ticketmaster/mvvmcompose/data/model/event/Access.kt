package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Access(
    @Json(name = "startDateTime") val startDateTime: String,
    @Json(name = "startApproximate") val startApproximate: Boolean,
    @Json(name = "endDateTime") val endDateTime: String?,
    @Json(name = "endApproximate") val endApproximate: Boolean,
)