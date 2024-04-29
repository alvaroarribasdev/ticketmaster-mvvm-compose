package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AgeRestrictions(
    @Json(name = "legalAgeEnforced") val legalAgeEnforced: Boolean?,
    @Json(name = "id") val id: String?,
)