package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Product(
    @Json(name = "name") val name: String,
    @Json(name = "id") val id: String,
    @Json(name = "url") val url: String,
    @Json(name = "type") val type: String,
    @Json(name = "classifications") val classifications: List<Classification3>,
)