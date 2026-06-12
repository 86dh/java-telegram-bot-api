package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

data class RichBlockCaption(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("credit") val credit: RichText? = null
)
