package com.pengrad.telegrambot.model

import com.pengrad.telegrambot.utility.kotlin.JavaInteger

data class LivePhoto(
    @get:JvmName("fileId") val fileId: String,
    @get:JvmName("fileUniqueId") val fileUniqueId: String,

    @get:JvmSynthetic val width: Int,
    @get:JvmSynthetic val height: Int,
    @get:JvmSynthetic val duration: Int,

    @get:JvmName("photo") val photo: Array<PhotoSize>? = null,
    @get:JvmName("mimeType") val mimeType: String? = null,
    @get:JvmName("fileSize") val fileSize: Long? = null,
) {

    fun width() = width as JavaInteger
    fun height() = height as JavaInteger
    fun duration() = duration as JavaInteger

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LivePhoto) return false
        return fileId == other.fileId &&
                fileUniqueId == other.fileUniqueId &&
                width == other.width &&
                height == other.height &&
                duration == other.duration &&
                photo contentEquals other.photo &&
                mimeType == other.mimeType &&
                fileSize == other.fileSize
    }

    override fun hashCode(): Int {
        var result = fileId.hashCode()
        result = 31 * result + fileUniqueId.hashCode()
        result = 31 * result + width.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + duration.hashCode()
        result = 31 * result + (photo?.contentHashCode() ?: 0)
        result = 31 * result + (mimeType?.hashCode() ?: 0)
        result = 31 * result + (fileSize?.hashCode() ?: 0)
        return result
    }
}
