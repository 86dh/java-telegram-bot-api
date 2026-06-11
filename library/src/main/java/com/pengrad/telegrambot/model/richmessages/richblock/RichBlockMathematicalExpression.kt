package com.pengrad.telegrambot.model.richmessages.richblock

data class RichBlockMathematicalExpression(
    @get:JvmName("expression") val expression: String
) : RichBlock {
    override val type: String get() = RichBlockType.MATHEMATICAL_EXPRESSION
}
