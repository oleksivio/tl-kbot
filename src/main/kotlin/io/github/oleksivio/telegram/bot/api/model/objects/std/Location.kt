package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Location](https://core.telegram.org/bots/api/#location)
 */
data class Location(
        /**
         * To setup filter:
         *
         * @see DoubleFilter longitude longitude Float Longitude as defined by sender
         */
        @JsonProperty("longitude")
        var longitude: Double? = null,
        /**
         * To setup filter:
         *
         * @see DoubleFilter latitude latitude Float Latitude as defined by sender
         */
        @JsonProperty("latitude")
        var latitude: Double? = null

) : ITelegram
