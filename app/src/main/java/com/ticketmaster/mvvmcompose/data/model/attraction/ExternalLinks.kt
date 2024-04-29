package com.ticketmaster.mvvmcompose.data.model.attraction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExternalLinks(
    @Json(name = "youtube") val youtube: List<Youtube>?,
    @Json(name = "twitter") val twitter: List<Twitter2>?,
    @Json(name = "itunes") val itunes: List<Itunes>?,
    @Json(name = "wiki") val wiki: List<Wiki>?,
    @Json(name = "facebook") val facebook: List<Facebook>?,
    @Json(name = "spotify") val spotify: List<Spotify>?,
    @Json(name = "musicbrainz") val musicbrainz: List<Musicbrainz>?,
    @Json(name = "instagram") val instagram: List<Instagram>?,
    @Json(name = "homepage") val homepage: List<Homepage>?,
)