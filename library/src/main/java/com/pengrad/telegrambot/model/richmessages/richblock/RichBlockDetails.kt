package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

class RichBlockDetails(
    @get:JvmName("summary") val summary: RichText,
    @get:JvmName("blocks") val blocks: Array<RichBlock>,
    @get:JvmName("isOpen") val isOpen: Boolean? = null
) : RichBlock {

    override val type: String get() = RichBlockType.DETAILS

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockDetails
        return summary == other.summary && blocks.contentEquals(other.blocks) && isOpen == other.isOpen
    }

    override fun hashCode(): Int {
        var result = summary.hashCode()
        result = 31 * result + blocks.contentHashCode()
        result = 31 * result + (isOpen?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String = "RichBlockDetails(summary=$summary, blocks=${blocks.contentToString()}, isOpen=$isOpen)"
}
