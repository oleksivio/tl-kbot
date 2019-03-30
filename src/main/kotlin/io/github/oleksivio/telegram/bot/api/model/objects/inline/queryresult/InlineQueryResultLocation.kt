package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultLocation](https://core.telegram.org/bots/api/#inlinequeryresultlocation)
 */
data class InlineQueryResultLocation(
        /**
         * latitude Float number Latitude of the location
         */
        @JsonProperty("latitude")
        val latitude: Double,
        /**
         * longitude Float number Longitude of the location
         */
        @JsonProperty("longitude")
        val longitude: Double,
        /**
         * live_period [Int] OptionalPeriod in seconds for which the location will be updated (see Live Locations, should
         * be between 60 and 86400
         */
        @JsonProperty("live_period")
        val livePeriod: Int? = null,
        /**
         * thumb_url [String] Optional. URL of the thumbnail (jpeg only) for the file
         */
        @JsonProperty("thumb_url")
        val thumbUrl: String? = null,
        /**
         * thumb_width Integer Optional. Thumbnail width
         */
        @JsonProperty("thumb_width")
        val thumbWidth: Int? = null,
        /**
         * thumb_height Integer Optional. Thumbnail height
         */
        @JsonProperty("thumb_height")
        val thumbHeight: Int? = null,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "location"
) : TitledInlineResult()
