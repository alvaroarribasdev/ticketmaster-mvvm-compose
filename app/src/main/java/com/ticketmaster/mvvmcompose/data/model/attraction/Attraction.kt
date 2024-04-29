package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attraction(
    @Json(name = "name") val name: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "id") val id: String?,
    @Json(name = "test") val test: Boolean?,
    @Json(name = "url") val url: String?,
    @Json(name = "locale") val locale: String?,
    @Json(name = "images") val images: List<Image3>?,
    @Json(name = "classifications") val classifications: List<Classification2>?,
    @Json(name = "upcomingEvents") val upcomingEvents: UpcomingEvents2?,
    @Json(name = "_links") val links: Links3?,
    @Json(name = "aliases") val aliases: List<String>?,
    @Json(name = "externalLinks") val externalLinks: ExternalLinks?,
)