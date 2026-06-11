package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.Audio

data class RichBlockAudio(
    @get:JvmName("audio") val audio: Audio,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {
    override val type: String get() = RichBlockType.AUDIO
}
