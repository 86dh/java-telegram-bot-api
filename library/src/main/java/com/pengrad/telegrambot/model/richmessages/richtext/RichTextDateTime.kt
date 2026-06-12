package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextDateTime(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("unixTime") val unixTime: Long,
    @get:JvmName("dateTimeFormat") val dateTimeFormat: String
) : RichText {
    override val type: String get() = RichTextType.DATE_TIME
}
