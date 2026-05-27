package com.pengrad.telegrambot.model

data class BotAccessSettings(
    val isAccessRestricted: Boolean? = null,
    @get:JvmName("addedUsers") val addedUsers: Array<User>? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BotAccessSettings) return false
        return isAccessRestricted == other.isAccessRestricted &&
                addedUsers contentEquals other.addedUsers
    }

    override fun hashCode(): Int {
        var result = isAccessRestricted?.hashCode() ?: 0
        result = 31 * result + (addedUsers?.contentHashCode() ?: 0)
        return result
    }
}
