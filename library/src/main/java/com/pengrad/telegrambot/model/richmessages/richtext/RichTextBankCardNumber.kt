package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextBankCardNumber(
    @get:JvmName("text") val text: RichText,
    @get:JvmName("bankCardNumber") val bankCardNumber: String
) : RichText {
    override val type: String get() = RichTextType.BANK_CARD_NUMBER
}
