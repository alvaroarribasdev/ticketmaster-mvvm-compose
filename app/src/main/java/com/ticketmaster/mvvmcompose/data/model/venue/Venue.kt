package com.ticketmaster.mvvmcompose.data.model.venue

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Venue(
    @Json(name = "name") val name: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "id") val id: String?,
    @Json(name = "test") val test: Boolean?,
    @Json(name = "url") val url: String?,
    @Json(name = "locale") val locale: String?,
    @Json(name = "images") val images: List<Image2>?,
    @Json(name = "postalCode") val postalCode: String?,
    @Json(name = "timezone") val timezone: String?,
    @Json(name = "city") val city: City?,
    @Json(name = "state") val state: State?,
    @Json(name = "country") val country: Country?,
    @Json(name = "address") val address: Address?,
    @Json(name = "location") val location: Location?,
    @Json(name = "markets") val markets: List<Market>?,
    @Json(name = "dmas") val dmas: List<Dma>?,
    @Json(name = "social") val social: Social?,
    @Json(name = "boxOfficeInfo") val boxOfficeInfo: BoxOfficeInfo?,
    @Json(name = "parkingDetail") val parkingDetail: String?,
    @Json(name = "accessibleSeatingDetail") val accessibleSeatingDetail: String?,
    @Json(name = "generalInfo") val generalInfo: GeneralInfo?,
    @Json(name = "upcomingEvents") val upcomingEvents: UpcomingEvents,
    @Json(name = "ada") val ada: Ada?,
    @Json(name = "_links") val links: Links2,
    @Json(name = "aliases") val aliases: List<String>?,
)