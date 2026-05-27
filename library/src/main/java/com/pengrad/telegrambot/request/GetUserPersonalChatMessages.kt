package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.MessagesResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class GetUserPersonalChatMessages(
    userId: Long,
    limit: Int,
) : KBaseRequest<GetUserPersonalChatMessages, MessagesResponse>(MessagesResponse::class) {

    val userId: Long by requestParameter(userId)
    val limit: Int by requestParameter(limit)
}
