package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.Location

data class RichBlockMap(
    @get:JvmName("location") val location: Location,
    @get:JvmName("zoom") val zoom: Int,
    @get:JvmName("width") val width: Int,
    @get:JvmName("height") val height: Int,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {
    override val type: String get() = RichBlockType.MAP
}
