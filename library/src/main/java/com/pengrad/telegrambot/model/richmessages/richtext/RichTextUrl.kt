package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextUrl(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("url") val url: String
) : RichText {
    override val type: String get() = RichTextType.URL
}
