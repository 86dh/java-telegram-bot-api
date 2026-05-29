package com.pengrad.telegrambot.model.request

import java.io.Serializable

class InputMediaVenue(
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val address: String,
) : InputPollMedia, InputPollOptionMedia, Serializable {

    val type: String = "venue"
    var foursquareId: String? = null
    var foursquareType: String? = null
    var googlePlaceId: String? = null
    var googlePlaceType: String? = null

    fun foursquareId(foursquareId: String): InputMediaVenue {
        this.foursquareId = foursquareId
        return this
    }

    fun foursquareType(foursquareType: String): InputMediaVenue {
        this.foursquareType = foursquareType
        return this
    }

    fun googlePlaceId(googlePlaceId: String): InputMediaVenue {
        this.googlePlaceId = googlePlaceId
        return this
    }

    fun googlePlaceType(googlePlaceType: String): InputMediaVenue {
        this.googlePlaceType = googlePlaceType
        return this
    }
}
