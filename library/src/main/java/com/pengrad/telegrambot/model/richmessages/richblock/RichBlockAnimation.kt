package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.Animation

data class RichBlockAnimation(
    @get:JvmName("animation") val animation: Animation,
    @get:JvmName("hasSpoiler") val hasSpoiler: Boolean? = null,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {
    override val type: String get() = RichBlockType.ANIMATION
}
