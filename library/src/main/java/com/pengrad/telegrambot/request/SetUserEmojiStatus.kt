package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SetUserEmojiStatus(
    userId: Long,
    emojiStatusCustomEmojiId: String,
    emojiStatusExpirationDate: Long
) : KBaseRequest<SetUserEmojiStatus, BaseResponse>(BaseResponse::class) {

    val userId: Long by requestParameter(userId)
    val emojiStatusCustomEmojiId: String by requestParameter(emojiStatusCustomEmojiId)
    val emojiStatusExpirationDate: Long by requestParameter(emojiStatusExpirationDate)

}