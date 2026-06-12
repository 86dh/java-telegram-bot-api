package com.pengrad.telegrambot.model.richmessages.richblock

data class RichBlockAnchor(
    @get:JvmName("name") val name: String
) : RichBlock {
    override val type: String get() = RichBlockType.ANCHOR
}
