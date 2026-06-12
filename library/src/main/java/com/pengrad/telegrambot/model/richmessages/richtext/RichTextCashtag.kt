package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextCashtag(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("cashtag") val cashtag: String
) : RichText {
    override val type: String get() = RichTextType.CASHTAG
}
