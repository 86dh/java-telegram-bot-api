package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextPlain(
    @get:JvmName("text") val text: String
) : RichText {
    override val type: String get() = "plain"
}
