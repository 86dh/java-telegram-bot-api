package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class DeleteAllMessageReactions private constructor(
    chatId: Long?,
    channelUsername: String?,
    messageId: Int,
) : KBaseRequest<DeleteAllMessageReactions, BaseResponse>(BaseResponse::class) {

    constructor(chatId: Long, messageId: Int) : this(
        chatId = chatId,
        channelUsername = null,
        messageId = messageId,
    )

    constructor(channelUsername: String, messageId: Int) : this(
        chatId = null,
        channelUsername = channelUsername,
        messageId = messageId,
    )

    val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
    val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")
    val messageId: Int by requestParameter(messageId)

}
