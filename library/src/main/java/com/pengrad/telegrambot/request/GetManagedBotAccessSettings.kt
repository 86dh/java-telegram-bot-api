package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BotAccessSettingsResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class GetManagedBotAccessSettings(
    userId: Long,
) : KBaseRequest<GetManagedBotAccessSettings, BotAccessSettingsResponse>(BotAccessSettingsResponse::class) {

    val userId: Long by requestParameter(userId)
}
