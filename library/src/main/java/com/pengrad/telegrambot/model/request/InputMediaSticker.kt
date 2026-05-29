package com.pengrad.telegrambot.model.request

import java.io.File

class InputMediaSticker : InputMedia<InputMediaSticker>, InputPollOptionMedia {

    constructor(media: String) : super("sticker", media)
    constructor(media: File) : super("sticker", media)
    constructor(media: ByteArray) : super("sticker", media)

    private var emoji: String? = null

    fun emoji(emoji: String): InputMediaSticker {
        this.emoji = emoji
        return this
    }

    override fun getDefaultFileName(): String = "file.webp"
    override fun getDefaultContentType(): String = "image/webp"
}
