package com.ticketmaster.mvvmcompose.data.remote.api.attraction

interface AttractionsApi {
    @GET("attractions/{attraction_id}/images")
    fun getAttractionImages(
        @Path("attraction_id") attractionId: String
    ): Call<ImagesResponse>
}