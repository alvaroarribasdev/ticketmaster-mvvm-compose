package com.ticketmaster.mvvmcompose.data.model.event

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Classification3(
    @Json(name = "primary") val primary: Boolean?,
    @Json(name = "segment") val segment: Segment3?,
    @Json(name = "genre") val genre: Genre3?,
    @Json(name = "subGenre") val subGenre: SubGenre3?,
    @Json(name = "type") val type: Type3?,
    @Json(name = "subType") val subType: SubType3?,
    @Json(name = "family") val family: Boolean?,
)