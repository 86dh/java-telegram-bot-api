package com.pengrad.telegrambot.request

import com.pengrad.telegrambot.model.MessageEntity
import com.pengrad.telegrambot.model.request.ParseMode
import com.pengrad.telegrambot.utility.kotlin.checkDeprecatedConstructorParameters
import com.pengrad.telegrambot.utility.kotlin.optionalRequestParameter
import java.io.File

class SendLivePhoto private constructor(
    chatId: Long? = null,
    channelUsername: String? = null,

    livePhotoUrl: String? = null,
    livePhotoFile: File? = null,
    livePhotoBytes: ByteArray? = null,
) : AbstractMultipartRequest<SendLivePhoto>(
    chatId = chatId,
    channelUsername = channelUsername,

    contentParameterName = "live_photo",
    contentUrl = livePhotoUrl,
    contentFile = livePhotoFile,
    contentBytes = livePhotoBytes,

    defaultFileName = ContentTypes.PHOTO_FILE_NAME,
    defaultContentType = ContentTypes.PHOTO_MIME_TYPE,
) {

    constructor(chatId: Long, livePhotoUrl: String) : this(
        chatId = chatId,
        channelUsername = null,
        livePhotoUrl = livePhotoUrl,
    )

    constructor(channelUsername: String, livePhotoUrl: String) : this(
        chatId = null,
        channelUsername = channelUsername,
        livePhotoUrl = livePhotoUrl,
    )

    constructor(chatId: Long, livePhotoFile: File) : this(
        chatId = chatId,
        channelUsername = null,
        livePhotoFile = livePhotoFile,
    )

    constructor(channelUsername: String, livePhotoFile: File) : this(
        chatId = null,
        channelUsername = channelUsername,
        livePhotoFile = livePhotoFile,
    )

    constructor(chatId: Long, livePhotoBytes: ByteArray) : this(
        chatId = chatId,
        channelUsername = null,
        livePhotoBytes = livePhotoBytes,
    )

    constructor(channelUsername: String, livePhotoBytes: ByteArray) : this(
        chatId = null,
        channelUsername = channelUsername,
        livePhotoBytes = livePhotoBytes,
    )

    @Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendLivePhoto(chatId, livePhoto)"))
    constructor(chatId: Any, livePhoto: String) : this(
        chatId = (chatId as? Number)?.toLong(),
        channelUsername = chatId as? String,
        livePhotoUrl = livePhoto,
    ) {
        checkDeprecatedConstructorParameters()
    }

    @Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendLivePhoto(chatId, livePhoto)"))
    constructor(chatId: Any, livePhoto: File) : this(
        chatId = (chatId as? Number)?.toLong(),
        channelUsername = chatId as? String,
        livePhotoFile = livePhoto,
    ) {
        checkDeprecatedConstructorParameters()
    }

    @Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendLivePhoto(chatId, livePhoto)"))
    constructor(chatId: Any, livePhoto: ByteArray) : this(
        chatId = (chatId as? Number)?.toLong(),
        channelUsername = chatId as? String,
        livePhotoBytes = livePhoto,
    ) {
        checkDeprecatedConstructorParameters()
    }

    var caption: String? by optionalRequestParameter()
    var parseMode: ParseMode? by optionalRequestParameter()
    var captionEntities: List<MessageEntity>? by optionalRequestParameter()
    var showCaptionAboveMedia: Boolean? by optionalRequestParameter()
    var hasSpoiler: Boolean? by optionalRequestParameter()

    fun caption(caption: String) = applySelf { this.caption = caption }
    fun parseMode(parseMode: ParseMode) = applySelf { this.parseMode = parseMode }
    fun captionEntities(captionEntities: List<MessageEntity>) = applySelf { this.captionEntities = captionEntities }
    fun captionEntities(vararg captionEntities: MessageEntity) = applySelf { this.captionEntities = captionEntities.toList() }
    fun showCaptionAboveMedia(showCaptionAboveMedia: Boolean) = applySelf { this.showCaptionAboveMedia = showCaptionAboveMedia }
    fun hasSpoiler(hasSpoiler: Boolean) = applySelf { this.hasSpoiler = hasSpoiler }
}
