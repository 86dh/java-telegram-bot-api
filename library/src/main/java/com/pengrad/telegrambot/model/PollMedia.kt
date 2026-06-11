package com.pengrad.telegrambot.model

data class PollMedia(
    @get:JvmName("animation") val animation: Animation? = null,
    @get:JvmName("audio") val audio: Audio? = null,
    @get:JvmName("document") val document: Document? = null,
    @get:JvmName("livePhoto") val livePhoto: LivePhoto? = null,
    @get:JvmName("location") val location: Location? = null,
    @get:JvmName("photo") val photo: Array<PhotoSize>? = null,
    @get:JvmName("sticker") val sticker: Sticker? = null,
    @get:JvmName("venue") val venue: Venue? = null,
    @get:JvmName("video") val video: Video? = null,
    @get:JvmName("link") val link: Link? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PollMedia) return false
        return animation == other.animation &&
                audio == other.audio &&
                document == other.document &&
                livePhoto == other.livePhoto &&
                location == other.location &&
                photo contentEquals other.photo &&
                sticker == other.sticker &&
                venue == other.venue &&
                video == other.video &&
                link == other.link
    }

    override fun hashCode(): Int {
        var result = animation?.hashCode() ?: 0
        result = 31 * result + (audio?.hashCode() ?: 0)
        result = 31 * result + (document?.hashCode() ?: 0)
        result = 31 * result + (livePhoto?.hashCode() ?: 0)
        result = 31 * result + (location?.hashCode() ?: 0)
        result = 31 * result + (photo?.contentHashCode() ?: 0)
        result = 31 * result + (sticker?.hashCode() ?: 0)
        result = 31 * result + (venue?.hashCode() ?: 0)
        result = 31 * result + (video?.hashCode() ?: 0)
        result = 31 * result + (link?.hashCode() ?: 0)
        return result
    }
}
