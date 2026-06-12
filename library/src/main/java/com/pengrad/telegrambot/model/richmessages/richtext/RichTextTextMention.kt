package com.pengrad.telegrambot.model.richmessages.richtext

import com.pengrad.telegrambot.model.User

data class RichTextTextMention(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("user") val user: User
) : RichText {
    override val type: String get() = RichTextType.TEXT_MENTION
}
