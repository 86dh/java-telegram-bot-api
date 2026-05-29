package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.request.InlineQueryResult
import com.pengrad.telegrambot.response.SentGuestMessageResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class AnswerGuestQuery(
    guestQueryId: String,
    result: InlineQueryResult<*>,
) : KBaseRequest<AnswerGuestQuery, SentGuestMessageResponse>(SentGuestMessageResponse::class) {

    val guestQueryId: String by requestParameter(guestQueryId)
    val result: InlineQueryResult<*> by requestParameter(result)

}
