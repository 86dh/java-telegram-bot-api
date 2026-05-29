package com.pengrad.telegrambot.model

data class SentGuestMessage(
    @get:JvmName("inlineMessageId") val inlineMessageId: String? = null,
)
