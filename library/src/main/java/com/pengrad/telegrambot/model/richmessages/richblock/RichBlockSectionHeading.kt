package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

data class RichBlockSectionHeading(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("size") val size: Int
) : RichBlock {
    override val type: String get() = RichBlockType.HEADING
}
