package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextHashtag(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("hashtag") val hashtag: String
) : RichText {
    override val type: String get() = RichTextType.HASHTAG
}
