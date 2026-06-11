package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextBotCommand(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("botCommand") val botCommand: String
) : RichText {
    override val type: String get() = RichTextType.BOT_COMMAND
}
