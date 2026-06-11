package com.pengrad.telegrambot.model.richmessages.richblock

class RichBlockList(
    @get:JvmName("items") val items: Array<RichBlockListItem>
) : RichBlock {

    override val type: String get() = RichBlockType.LIST

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockList
        return items.contentEquals(other.items)
    }

    override fun hashCode(): Int = items.contentHashCode()

    override fun toString(): String = "RichBlockList(items=${items.contentToString()})"
}
