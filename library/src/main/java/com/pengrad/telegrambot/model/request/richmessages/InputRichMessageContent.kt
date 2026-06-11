package com.pengrad.telegrambot.model.request.richmessages

import com.pengrad.telegrambot.model.request.InputMessageContent

class InputRichMessageContent(
    @get:JvmName("richMessage") val richMessage: InputRichMessage
) : InputMessageContent() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as InputRichMessageContent
        return richMessage == other.richMessage
    }

    override fun hashCode(): Int = richMessage.hashCode()

    override fun toString(): String = "InputRichMessageContent(richMessage=$richMessage)"
}
