package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextMention(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("username") val username: String
) : RichText {
    override val type: String get() = RichTextType.MENTION
}
