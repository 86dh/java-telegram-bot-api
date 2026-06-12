package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextPhoneNumber(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("phoneNumber") val phoneNumber: String
) : RichText {
    override val type: String get() = RichTextType.PHONE_NUMBER
}
