package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.Video

data class RichBlockVideo(
    @get:JvmName("video") val video: Video,
    @get:JvmName("hasSpoiler") val hasSpoiler: Boolean? = null,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {
    override val type: String get() = RichBlockType.VIDEO
}
