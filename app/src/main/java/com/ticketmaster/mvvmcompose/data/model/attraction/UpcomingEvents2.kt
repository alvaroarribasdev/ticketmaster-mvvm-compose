package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpcomingEvents2(
    @Json(name = "tmr") val tmr: Long?,
    @Json(name = "_total") val total: Long,
    @Json(name = "_filtered") val filtered: Long,
    @Json(name = "wts-tr") val wtsTr: Long?,
    @Json(name = "ticketmaster") val ticketmaster: Long?,
    @Json(name = "tmc") val tmc: Long?,
    @Json(name = "universe") val universe: Long?,
    @Json(name = "ticketweb") val ticketweb: Long?,
)