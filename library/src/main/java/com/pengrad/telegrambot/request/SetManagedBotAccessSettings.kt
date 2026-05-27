package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import com.pengrad.telegrambot.utility.kotlin.requestParameter

class SetManagedBotAccessSettings(
    userId: Long,
    isAccessRestricted: Boolean,
) : KBaseRequest<SetManagedBotAccessSettings, BaseResponse>(BaseResponse::class) {

    val userId: Long by requestParameter(userId)
    val isAccessRestricted: Boolean by requestParameter(isAccessRestricted)
    var addedUserIds: List<Long>? by optionalRequestParameter()

    fun addedUserIds(addedUserIds: List<Long>) = applySelf { this.addedUserIds = addedUserIds }
    fun addedUserIds(vararg addedUserIds: Long) = applySelf { this.addedUserIds = addedUserIds.toList() }
}
