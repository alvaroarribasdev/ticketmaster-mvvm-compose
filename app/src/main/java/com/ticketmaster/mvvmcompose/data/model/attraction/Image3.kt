package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image3(
    @Json(name = "ratio") val ratio: String?,
    @Json(name = "url") val url: String,
    @Json(name = "width") val width: Long,
    @Json(name = "height") val height: Long,
    @Json(name = "fallback") val fallback: Boolean,
)