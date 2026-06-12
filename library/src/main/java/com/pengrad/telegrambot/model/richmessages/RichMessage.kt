package com.pengrad.telegrambot.model.richmessages

import com.pengrad.telegrambot.model.richmessages.richblock.RichBlock

class RichMessage(
    @get:JvmName("blocks") val blocks: Array<RichBlock>,
    @get:JvmName("isRtl") val isRtl: Boolean? = null
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichMessage
        return blocks.contentEquals(other.blocks) && isRtl == other.isRtl
    }

    override fun hashCode(): Int {
        var result = blocks.contentHashCode()
        result = 31 * result + (isRtl?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String = "RichMessage(blocks=${blocks.contentToString()}, isRtl=$isRtl)"
}
