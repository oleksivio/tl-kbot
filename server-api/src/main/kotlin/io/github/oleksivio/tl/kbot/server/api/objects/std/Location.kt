package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [Location](https://core.telegram.org/bots/api/#location)
 */
data class Location(
        /**
         * To setup filter:
         *
         *  DoubleFilter longitude longitude Float Longitude as defined by sender
         */
        @JsonProperty("longitude")
        var longitude: Double? = null,
        /**
         * To setup filter:
         *
         *  DoubleFilter latitude latitude Float Latitude as defined by sender
         */
        @JsonProperty("latitude")
        var latitude: Double? = null

) : ITelegram
