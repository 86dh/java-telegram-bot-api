package com.pengrad.telegrambot.model.richmessages.richtext

class RichTextUnknown(override val type: String = RichTextType.UNKNOWN) : RichText {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichTextUnknown
        return type == other.type
    }

    override fun hashCode(): Int = type.hashCode()

    override fun toString(): String = "RichTextUnknown(type='$type')"
}
