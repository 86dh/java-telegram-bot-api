package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.GetUserProfileAudiosResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class GetUserProfileAudios(
    userId: Long
) : KBaseRequest<GetUserProfileAudios, GetUserProfileAudiosResponse>(GetUserProfileAudiosResponse::class) {

    val userId: Long by requestParameter(userId)

    var offset: Int? by optionalRequestParameter()
    var limit: Int? by optionalRequestParameter()

    fun offset(offset: Int) = applySelf { this.offset = offset }

    fun limit(limit: Int) = applySelf { this.limit = limit }

}