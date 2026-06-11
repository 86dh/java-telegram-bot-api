package com.pengrad.telegrambot.model.richmessages.richblock

import com.pengrad.telegrambot.model.richmessages.richtext.RichText

data class RichBlockTableCell(
    @get:JvmName("text") val text: RichText? = null,
    @get:JvmName("isHeader") val isHeader: Boolean? = null,
    @get:JvmName("colspan") val colspan: Int? = null,
    @get:JvmName("rowspan") val rowspan: Int? = null,
    @get:JvmName("align") val align: String? = null,
    @get:JvmName("valign") val valign: String? = null
)
