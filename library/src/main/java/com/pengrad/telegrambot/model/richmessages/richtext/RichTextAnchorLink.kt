package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextAnchorLink(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("anchorName") val anchorName: String
) : RichText {
    override val type: String get() = RichTextType.ANCHOR_LINK
}
