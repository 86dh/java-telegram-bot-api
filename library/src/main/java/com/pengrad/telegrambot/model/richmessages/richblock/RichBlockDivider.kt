package com.pengrad.telegrambot.model.richmessages.richblock

class RichBlockDivider : RichBlock {
    override val type: String get() = RichBlockType.DIVIDER

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        return other is RichBlockDivider
    }

    override fun hashCode(): Int = type.hashCode()

    override fun toString(): String = "RichBlockDivider()"
}
