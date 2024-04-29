package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Event(
    @Json(name = "name") val name: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "id") val id: String?,
    @Json(name = "test") val test: Boolean?,
    @Json(name = "url") val url: String?,
    @Json(name = "locale") val locale: String?,
    @Json(name = "images") val images: List<Image>?,
    @Json(name = "sales") val sales: Sales?,
    @Json(name = "dates") val dates: Dates?,
    @Json(name = "classifications") val classifications: List<Classification>?,
    @Json(name = "info") val info: String?,
    @Json(name = "pleaseNote") val pleaseNote: String?,
    @Json(name = "priceRanges") val priceRanges: List<PriceRange>?,
    @Json(name = "seatmap") val seatmap: Seatmap?,
    @Json(name = "accessibility") val accessibility: Accessibility?,
    @Json(name = "ticketLimit") val ticketLimit: TicketLimit?,
    @Json(name = "ageRestrictions") val ageRestrictions: AgeRestrictions?,
    @Json(name = "ticketing") val ticketing: Ticketing?,
    @Json(name = "_links") val links: Links?,
    @Json(name = "_embedded") val embedded: Embedded2?,
    @Json(name = "promoter") val promoter: Promoter?,
    @Json(name = "promoters") val promoters: List<Promoter2>?,
    @Json(name = "description") val description: String?,
    @Json(name = "outlets") val outlets: List<Outlet>?,
    @Json(name = "products") val products: List<Product>?,
)