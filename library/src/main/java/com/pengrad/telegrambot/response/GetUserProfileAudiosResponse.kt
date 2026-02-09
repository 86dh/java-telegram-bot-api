package com.pengrad.telegrambot.response

import com.pengrad.telegrambot.model.UserProfileAudios

data class GetUserProfileAudiosResponse(val result: UserProfileAudios) : BaseResponse()