package com.pengrad.telegrambot.model.paidmedia

import com.pengrad.telegrambot.model.LivePhoto
import java.util.Objects

class PaidMediaLivePhoto : PaidMedia("live_photo") {

    companion object {
        const val TYPE = "live_photo"
    }

    @get:JvmName("livePhoto")
    val livePhoto: LivePhoto? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as PaidMediaLivePhoto
        return type() == that.type() && livePhoto == that.livePhoto
    }

    override fun hashCode(): Int = Objects.hash(type(), livePhoto)

    override fun toString(): String = "PaidMediaLivePhoto{livePhoto=$livePhoto}"
}
