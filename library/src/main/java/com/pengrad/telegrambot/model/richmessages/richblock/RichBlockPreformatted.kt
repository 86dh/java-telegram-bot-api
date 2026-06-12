package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

data class RichBlockPreformatted(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("language") val language: String? = null
) : RichBlock {
    override val type: String get() = RichBlockType.PRE
}
