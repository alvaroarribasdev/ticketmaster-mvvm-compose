package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoxOfficeInfo(
    @Json(name = "phoneNumberDetail") val phoneNumberDetail: String?,
    @Json(name = "openHoursDetail") val openHoursDetail: String?,
    @Json(name = "acceptedPaymentDetail") val acceptedPaymentDetail: String?,
    @Json(name = "willCallDetail") val willCallDetail: String?,
)