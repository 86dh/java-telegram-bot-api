package com.pengrad.telegrambot.model.richmessages.richtext

class RichTextArray(
    @get:JvmName("elements") val elements: Array<RichText>
) : RichText {

    override val type: String get() = "array"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichTextArray
        return elements.contentEquals(other.elements)
    }

    override fun hashCode(): Int = elements.contentHashCode()

    override fun toString(): String = "RichTextArray(elements=${elements.contentToString()})"
}
