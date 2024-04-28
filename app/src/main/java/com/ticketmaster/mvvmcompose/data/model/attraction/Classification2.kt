package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Classification2(
    @Json(name = "primary") val primary: Boolean,
    @Json(name = "segment") val segment: Segment2,
    @Json(name = "genre") val genre: Genre2,
    @Json(name = "subGenre") val subGenre: SubGenre2,
    @Json(name = "type") val type: Type2?,
    @Json(name = "subType") val subType: SubType2?,
    @Json(name = "family") val family: Boolean,
)