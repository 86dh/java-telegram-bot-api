package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SendChatJoinRequestWebApp(
    chatJoinRequestQueryId: String,
    webAppUrl: String,
) : KBaseRequest<SendChatJoinRequestWebApp, BaseResponse>(BaseResponse::class) {

    val chatJoinRequestQueryId: String by requestParameter(chatJoinRequestQueryId)
    val webAppUrl: String by requestParameter(webAppUrl)

}
