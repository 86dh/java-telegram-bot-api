package com.pengrad.telegrambot.model.richmessages.richtext

data class RichTextMathematicalExpression(
    @get:JvmName("expression") val expression: String
) : RichText {
    override val type: String get() = RichTextType.MATHEMATICAL_EXPRESSION
}
