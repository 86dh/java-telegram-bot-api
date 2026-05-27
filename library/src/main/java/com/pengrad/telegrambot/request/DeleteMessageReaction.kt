package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.reaction.ReactionType
import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class DeleteMessageReaction private constructor(
    chatId: Long?,
    channelUsername: String?,
    messageId: Int,
    type: ReactionType,
) : KBaseRequest<DeleteMessageReaction, BaseResponse>(BaseResponse::class) {

    constructor(chatId: Long, messageId: Int, type: ReactionType) : this(
        chatId = chatId,
        channelUsername = null,
        messageId = messageId,
        type = type,
    )

    constructor(channelUsername: String, messageId: Int, type: ReactionType) : this(
        chatId = null,
        channelUsername = channelUsername,
        messageId = messageId,
        type = type,
    )

    val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
    val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")
    val messageId: Int by requestParameter(messageId)
    val type: ReactionType by requestParameter(type)

}
