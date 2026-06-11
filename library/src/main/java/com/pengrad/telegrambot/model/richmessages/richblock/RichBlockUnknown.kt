package com.pengrad.telegrambot.model.richmessages.richblock

class RichBlockUnknown(override val type: String = RichBlockType.UNKNOWN) : RichBlock {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockUnknown
        return type == other.type
    }

    override fun hashCode(): Int = type.hashCode()

    override fun toString(): String = "RichBlockUnknown(type='$type')"
}
