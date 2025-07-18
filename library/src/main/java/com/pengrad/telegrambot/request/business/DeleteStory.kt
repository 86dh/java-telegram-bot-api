package com.pengrad.telegrambot.request.business

import com.pengrad.telegrambot.request.KBaseRequest
import com.pengrad.telegrambot.response.BaseResponse
import com.pengrad.telegrambot.utility.kotlin.requestParameter

@Suppress("unused")
class DeleteStory(
    businessConnectionId: String,
    storyId: Int
): KBaseRequest<DeleteStory, BaseResponse>(BaseResponse::class) {

    val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
    val storyId: Int by requestParameter(storyId, customParameterName = "story_id")

}