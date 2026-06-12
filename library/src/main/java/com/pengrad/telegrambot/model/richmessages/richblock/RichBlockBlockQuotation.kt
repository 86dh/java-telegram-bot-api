package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

class RichBlockBlockQuotation(
    @get:JvmName("blocks") val blocks: Array<RichBlock>,
    @get:JvmName("credit") val credit: RichText? = null
) : RichBlock {

    override val type: String get() = RichBlockType.BLOCKQUOTE

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockBlockQuotation
        return blocks.contentEquals(other.blocks) && credit == other.credit
    }

    override fun hashCode(): Int {
        var result = blocks.contentHashCode()
        result = 31 * result + (credit?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String = "RichBlockBlockQuotation(blocks=${blocks.contentToString()}, credit=$credit)"
}
