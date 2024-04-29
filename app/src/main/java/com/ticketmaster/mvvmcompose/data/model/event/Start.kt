package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Start(
    @Json(name = "localDate") val localDate: String?,
    @Json(name = "dateTBD") val dateTbd: Boolean?,
    @Json(name = "dateTBA") val dateTba: Boolean?,
    @Json(name = "timeTBA") val timeTba: Boolean?,
    @Json(name = "noSpecificTime") val noSpecificTime: Boolean?,
    @Json(name = "localTime") val localTime: String?,
    @Json(name = "dateTime") val dateTime: String?,
)