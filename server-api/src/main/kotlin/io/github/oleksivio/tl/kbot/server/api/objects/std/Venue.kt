package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [Venue](https://core.telegram.org/bots/api/#venue)
 */
data class Venue(
    /**
         * To setup filter:
         *
         *  LocationFilter location location Location Venue location
         */
        @JsonProperty("location")
        var location: Location? = null,
    /**
         * To setup filter:
         *
         *  StringFilter title title String Name of the venue
         */
        @JsonProperty("title")
        var title: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter address address String Address of the venue
         */
        @JsonProperty("address")
        var address: String? = null,
    /**
         * To setup filter:
         *
         *  NotNullFilter foursquareId foursquare_id [String] Optional. Foursquare identifier of the venue
         */
        @JsonProperty("foursquare_id")
        var foursquareId: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter foursquareType foursquare_type [String] Optional. Foursquare type of the venue.
         */
        @JsonProperty("foursquare_type")
        var foursquareType: String? = null
) : ITelegram
