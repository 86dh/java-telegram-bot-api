package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.PhotoSize

class RichBlockPhoto(
    @get:JvmName("photo") val photo: Array<PhotoSize>,
    @get:JvmName("hasSpoiler") val hasSpoiler: Boolean? = null,
    @get:JvmName("caption") val caption: RichBlockCaption? = null
) : RichBlock {

    override val type: String get() = RichBlockType.PHOTO

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RichBlockPhoto
        return photo.contentEquals(other.photo) && hasSpoiler == other.hasSpoiler && caption == other.caption
    }

    override fun hashCode(): Int {
        var result = photo.contentHashCode()
        result = 31 * result + (hasSpoiler?.hashCode() ?: 0)
        result = 31 * result + (caption?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String = "RichBlockPhoto(photo=${photo.contentToString()}, hasSpoiler=$hasSpoiler, caption=$caption)"
}
