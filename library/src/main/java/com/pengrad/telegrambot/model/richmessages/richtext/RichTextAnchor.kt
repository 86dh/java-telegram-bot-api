package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextAnchor(
    @get:JvmName("name") val name: String
) : RichText {
    override val type: String get() = RichTextType.ANCHOR
}
