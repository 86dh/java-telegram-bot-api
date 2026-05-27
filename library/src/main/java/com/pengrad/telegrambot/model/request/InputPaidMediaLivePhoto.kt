package com.pengrad.telegrambot.model.request

import com.pengrad.telegrambot.request.ContentTypes
import java.io.File

class InputPaidMediaLivePhoto : InputPaidMedia {

    constructor(media: String) : super("live_photo", media)
    constructor(media: File) : super("live_photo", media)
    constructor(media: ByteArray) : super("live_photo", media)

    override fun getDefaultFileName(): String = ContentTypes.PHOTO_FILE_NAME
    override fun getDefaultContentType(): String = ContentTypes.PHOTO_MIME_TYPE
}
