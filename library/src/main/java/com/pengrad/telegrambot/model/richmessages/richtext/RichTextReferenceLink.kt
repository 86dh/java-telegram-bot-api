package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextReferenceLink(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("referenceName") val referenceName: String
) : RichText {
    override val type: String get() = RichTextType.REFERENCE_LINK
}
