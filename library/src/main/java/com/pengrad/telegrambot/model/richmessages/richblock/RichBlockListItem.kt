package com.pengrad.telegrambot.model.richmessages.richblock

class RichBlockListItem(
    @get:JvmName("label") val label: String,
    @get:JvmName("blocks") val blocks: Array<RichBlock>,
    @get:JvmName("hasCheckbox") val hasCheckbox: Boolean? = null,
    @get:JvmName("isChecked") val isChecked: Boolean? = null,
    @get:JvmName("value") val value: Int? = null,
    @get:JvmName("type") val type: String? = null
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockListItem
        return label == other.label &&
                blocks.contentEquals(other.blocks) &&
                hasCheckbox == other.hasCheckbox &&
                isChecked == other.isChecked &&
                value == other.value &&
                type == other.type
    }

    override fun hashCode(): Int {
        var result = label.hashCode()
        result = 31 * result + blocks.contentHashCode()
        result = 31 * result + (hasCheckbox?.hashCode() ?: 0)
        result = 31 * result + (isChecked?.hashCode() ?: 0)
        result = 31 * result + (value ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String =
        "RichBlockListItem(label='$label', blocks=${blocks.contentToString()}, hasCheckbox=$hasCheckbox, isChecked=$isChecked, value=$value, type=$type)"
}
