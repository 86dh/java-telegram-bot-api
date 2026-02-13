package com.pengrad.telegrambot.model

data class UserProfileAudios(
    @get:JvmName("totalCount") val totalCount: Int,
    @get:JvmName("audios") val audios: Array<Audio>
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserProfileAudios) return false

        return totalCount == other.totalCount &&
                audios contentEquals other.audios
    }

    override fun hashCode(): Int {
        var result = totalCount.hashCode()
        result = 31 * result + audios.contentHashCode()
        return result
    }

}