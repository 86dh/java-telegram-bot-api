package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextEmailAddress(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("emailAddress") val emailAddress: String
) : RichText {
    override val type: String get() = RichTextType.EMAIL_ADDRESS
}
