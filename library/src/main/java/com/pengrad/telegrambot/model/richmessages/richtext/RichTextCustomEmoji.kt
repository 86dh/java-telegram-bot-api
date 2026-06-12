package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextCustomEmoji(
    @get:JvmName("customEmojiId") val customEmojiId: String,
    @get:JvmName("alternativeText") val alternativeText: String
) : RichText {
    override val type: String get() = RichTextType.CUSTOM_EMOJI
}
