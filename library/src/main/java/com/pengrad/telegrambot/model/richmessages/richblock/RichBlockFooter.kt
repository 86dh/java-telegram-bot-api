package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

data class RichBlockFooter(
    @get:JvmName("text") val text: RichText
) : RichBlock {
    override val type: String get() = RichBlockType.FOOTER
}
