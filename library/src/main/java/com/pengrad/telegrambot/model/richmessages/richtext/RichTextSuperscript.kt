package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextSuperscript(
    @get:JvmName("text") val text: RichText
) : RichText {
    override val type: String get() = RichTextType.SUPERSCRIPT
}
