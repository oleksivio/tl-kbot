package io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InputVenueMessageContent](https://core.telegram.org/bots/api/#inputvenuemessagecontent)
 */
data class InputVenueMessageContent(
        /**
         * latitude Float Latitude of the venue in degrees
         */
        @JsonProperty("latitude")
        var latitude: Double? = null,
        /**
         * longitude Float Longitude of the venue in degrees
         */
        @JsonProperty("longitude")
        var longitude: Double? = null,
        /**
         * title String Name of the venue
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * address String Address of the venue
         */
        @JsonProperty("address")
        var address: String? = null,
        /**
         * foursquare_id [String] Optional Foursquare identifier of the venue
         */
        @JsonProperty("foursquare_id")
        var foursquareId: String? = null,
        /**
         * foursquare_type [String] Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”,
         * “arts_entertainment/aquarium” or “food/icecream”.)
         */
        @JsonProperty("foursquare_type")
        var foursquareType: String? = null
) : InputMessageContent
