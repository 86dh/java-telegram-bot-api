package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter

class DeleteAllMessageReactions private constructor(
    chatId: Long?,
    channelUsername: String?,
) : KBaseRequest<DeleteAllMessageReactions, BaseResponse>(BaseResponse::class) {

    constructor(chatId: Long) : this(
        chatId = chatId,
        channelUsername = null,
    )

    constructor(channelUsername: String) : this(
        chatId = null,
        channelUsername = channelUsername,
    )

    val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
    val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")

    var userId: Long? by optionalRequestParameter()
    var actorChatId: Long? by optionalRequestParameter()

    fun userId(userId: Long) = applySelf { this.userId = userId }
    fun actorChatId(actorChatId: Long) = applySelf { this.actorChatId = actorChatId }

}
