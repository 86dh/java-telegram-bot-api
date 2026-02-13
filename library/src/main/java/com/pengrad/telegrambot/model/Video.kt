package com.pengrad.telegrambot.model

import com.pengrad.telegrambot.utility.kotlin.JavaInteger

data class Video(
    @get:JvmName("fileId") val fileId: String,
    @get:JvmName("fileUniqueId") val fileUniqueId: String,

    @get:JvmSynthetic val width: Int,
    @get:JvmSynthetic val height: Int,
    @get:JvmSynthetic val duration: Int,

    @get:JvmName("thumbnail") val thumbnail: PhotoSize? = null,
    @get:JvmName("cover") val cover: List<PhotoSize>? = null,

    @get:JvmName("startTimestamp") val startTimestamp: Int? = null,

    @get:JvmName("fileName") val fileName: String? = null,
    @get:JvmName("mimeType") val mimeType: String? = null,
    @get:JvmName("fileSize") val fileSize: Long? = null,

    @get:JvmName("qualities") val qualities: Array<VideoQuality>? = null
) {

    /**
     * Backwards compatibility for Java code because of Kotlin optimization
     */
    fun width() = width as JavaInteger

    /**
     * Backwards compatibility for Java code because of Kotlin optimization
     */
    fun height() = height as JavaInteger

    /**
     * Backwards compatibility for Java code because of Kotlin optimization
     */
    fun duration() = duration as JavaInteger

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Video) return false

        return fileId == other.fileId &&
                fileUniqueId == other.fileUniqueId &&
                width == other.width &&
                height == other.height &&
                duration == other.duration &&
                thumbnail == other.thumbnail &&
                cover == other.cover &&
                startTimestamp == other.startTimestamp &&
                fileName == other.fileName &&
                mimeType == other.mimeType &&
                fileSize == other.fileSize &&
                qualities contentEquals other.qualities
    }

    override fun hashCode(): Int {
        var result = fileId.hashCode()
        result = 31 * result + fileUniqueId.hashCode()
        result = 31 * result + width.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + duration.hashCode()
        result = 31 * result + (thumbnail?.hashCode() ?: 0)
        result = 31 * result + (cover?.hashCode() ?: 0)
        result = 31 * result + (startTimestamp?.hashCode() ?: 0)
        result = 31 * result + (fileName?.hashCode() ?: 0)
        result = 31 * result + (mimeType?.hashCode() ?: 0)
        result = 31 * result + (fileSize?.hashCode() ?: 0)
        result = 31 * result + (qualities?.contentHashCode() ?: 0)
        return result
    }

}