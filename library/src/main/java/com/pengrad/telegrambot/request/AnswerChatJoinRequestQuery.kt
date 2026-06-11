package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class AnswerChatJoinRequestQuery(
    chatJoinRequestQueryId: String,
    result: String,
) : KBaseRequest<AnswerChatJoinRequestQuery, BaseResponse>(BaseResponse::class) {

    val chatJoinRequestQueryId: String by requestParameter(chatJoinRequestQueryId)
    val result: String by requestParameter(result)

}
