package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Classification(
    @Json(name = "primary") val primary: Boolean?,
    @Json(name = "segment") val segment: Segment?,
    @Json(name = "genre") val genre: Genre?,
    @Json(name = "subGenre") val subGenre: SubGenre?,
    @Json(name = "type") val type: Type?,
    @Json(name = "subType") val subType: SubType?,
    @Json(name = "family") val family: Boolean?,
)