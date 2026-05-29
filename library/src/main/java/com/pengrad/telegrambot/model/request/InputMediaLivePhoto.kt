package com.pengrad.telegrambot.model.request

import com.pengrad.telegrambot.request.ContentTypes
import java.io.File

class InputMediaLivePhoto : InputMedia<InputMediaLivePhoto>, InputPollMedia, InputPollOptionMedia {

    private var photo: String? = null
    private var has_spoiler: Boolean? = null

    constructor(media: String, photo: File) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    constructor(media: String, photo: ByteArray) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    constructor(media: File, photo: File) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    constructor(media: File, photo: ByteArray) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    constructor(media: ByteArray, photo: File) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    constructor(media: ByteArray, photo: ByteArray) : super("live_photo", media) {
        this.photo = addAttachment(photo)
    }

    fun hasSpoiler(hasSpoiler: Boolean): InputMediaLivePhoto {
        this.has_spoiler = hasSpoiler
        return this
    }

    override fun getDefaultFileName(): String = ContentTypes.VIDEO_FILE_NAME
    override fun getDefaultContentType(): String = ContentTypes.VIDEO_MIME_TYPE
}
