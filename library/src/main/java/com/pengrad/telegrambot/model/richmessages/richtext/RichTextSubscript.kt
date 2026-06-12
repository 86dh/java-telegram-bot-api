package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextSubscript(
    @get:JvmName("text") val text: RichText
) : RichText {
    override val type: String get() = RichTextType.SUBSCRIPT
}
