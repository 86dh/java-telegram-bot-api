package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextStrikethrough(
    @get:JvmName("text") val text: RichText
) : RichText {
    override val type: String get() = RichTextType.STRIKETHROUGH
}
