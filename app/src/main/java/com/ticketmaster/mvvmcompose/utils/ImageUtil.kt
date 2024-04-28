package com.ticketmaster.mvvmcompose.utils

import com.ticketmaster.mvvmcompose.data.model.event.Image

object ImageUtil {
    fun selectImage(images: List<Image>, desiredRatio: String, desiredWidth: Int, desiredHeight: Int): Image? {

        val filteredImages = images.filter { it.ratio == desiredRatio }

        return filteredImages.minByOrNull { image ->
            val widthDifference = Math.abs(image.width - desiredWidth)
            val heightDifference = Math.abs(image.height - desiredHeight)

            widthDifference + heightDifference
        }
    }
}