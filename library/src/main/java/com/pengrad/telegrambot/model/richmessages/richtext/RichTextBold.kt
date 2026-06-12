package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextBold(
    @get:JvmName("text") val text: RichText
) : RichText {
    override val type: String get() = RichTextType.BOLD
}
