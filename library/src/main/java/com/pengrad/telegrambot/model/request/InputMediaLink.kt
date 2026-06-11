package com.pengrad.telegrambot.model.request

import java.io.Serializable

class InputMediaLink(
    val url: String,
) : InputPollOptionMedia, Serializable {

    val type: String = "link"
}
