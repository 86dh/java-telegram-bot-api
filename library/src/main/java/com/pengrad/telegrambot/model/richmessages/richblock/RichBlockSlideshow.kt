package com.pengrad.telegrambot.model.richmessages.richblock

class RichBlockSlideshow(
    @get:JvmName("blocks") val blocks: Array<RichBlock>,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {

    override val type: String get() = RichBlockType.SLIDESHOW

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockSlideshow
        return blocks.contentEquals(other.blocks) && caption == other.caption
    }

    override fun hashCode(): Int {
        var result = blocks.contentHashCode()
        result = 31 * result + (caption?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String = "RichBlockSlideshow(blocks=${blocks.contentToString()}, caption=$caption)"
}
