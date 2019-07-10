package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultVenue](https://core.telegram.org/bots/api/#inlinequeryresultvenue)
 */
class InlineQueryResultVenue(
        /**
         * latitude Float number Latitude of the venue
         */
        @JsonProperty("latitude")
        var latitude: Double,
        /**
         * longitude Float number Longitude of the venue
         */
        @JsonProperty("longitude")
        var longitude: Double,
        /**
         * address String Address of the venue
         */
        @JsonProperty("address")
        var address: String,
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
        var foursquareType: String? = null,
        /**
         * thumb_url [String] Optional. URL of the thumbnail (jpeg only) for the file
         */
        @JsonProperty("thumb_url")
        var thumbUrl: String? = null,
        /**
         * thumb_width Integer Optional. Thumbnail width
         */
        @JsonProperty("thumb_width")
        var thumbWidth: Int? = null,
        /**
         * thumb_height Integer Optional. Thumbnail height
         */
        @JsonProperty("thumb_height")
        var thumbHeight: Int? = null,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "venue"

) : TitledInlineResult()
