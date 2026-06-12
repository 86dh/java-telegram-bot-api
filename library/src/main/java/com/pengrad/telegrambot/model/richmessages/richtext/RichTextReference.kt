package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextReference(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("name") val name: String
) : RichText {
    override val type: String get() = RichTextType.REFERENCE
}
