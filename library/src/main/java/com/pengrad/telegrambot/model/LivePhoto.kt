package com.pengrad.telegrambot.model

data class LivePhoto(
    @get:JvmName("photo") val photo: Array<PhotoSize>? = null,
    @get:JvmName("video") val video: Video? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LivePhoto) return false
        return photo contentEquals other.photo &&
                video == other.video
    }

    override fun hashCode(): Int {
        var result = photo?.contentHashCode() ?: 0
        result = 31 * result + (video?.hashCode() ?: 0)
        return result
    }
}
