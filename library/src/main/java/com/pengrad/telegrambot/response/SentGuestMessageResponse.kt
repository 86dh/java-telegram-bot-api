package com.pengrad.telegrambot.response

import com.pengrad.telegrambot.model.SentGuestMessage

data class SentGuestMessageResponse(val result: SentGuestMessage) : BaseResponse()
