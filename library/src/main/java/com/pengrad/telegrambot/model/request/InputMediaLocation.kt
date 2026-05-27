package com.pengrad.telegrambot.model.request

import java.io.Serializable

class InputMediaLocation(
    val latitude: Float,
    val longitude: Float,
) : InputPollMedia, InputPollOptionMedia, Serializable {

    val type: String = "location"
    var horizontalAccuracy: Float? = null

    fun horizontalAccuracy(horizontalAccuracy: Float): InputMediaLocation {
        this.horizontalAccuracy = horizontalAccuracy
        return this
    }
}
