package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Venue](https://core.telegram.org/bots/api/#venue)
 */
data class Venue(
        /**
         * To setup filter:
         *
         * @see LocationFilter location location Location Venue location
         */
        @JsonProperty("location")
        var location: Location? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter title title String Name of the venue
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter address address String Address of the venue
         */
        @JsonProperty("address")
        var address: String? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter foursquareId foursquare_id String Optional. Foursquare identifier of the venue
         */
        @JsonProperty("foursquare_id")
        var foursquareId: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter foursquareType foursquare_type String Optional. Foursquare type of the venue.
         */
        @JsonProperty("foursquare_type")
        var foursquareType: String? = null
) : ITelegram
