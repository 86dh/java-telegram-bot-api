package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.Voice

data class RichBlockVoiceNote(
    @get:JvmName("voiceNote") val voiceNote: Voice,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {
    override val type: String get() = RichBlockType.VOICE_NOTE
}
