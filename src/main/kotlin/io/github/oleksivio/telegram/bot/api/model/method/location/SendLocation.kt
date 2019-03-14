package io.github.oleksivio.telegram.bot.api.model.method.location

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.MessageAction

/**
 * @see [sendLocation](https://core.telegram.org/bots/api.sendlocation)
 */
class SendLocation(actionNetworker: ActionNetworker) : MessageAction(METHOD, actionNetworker) {
    /**
     * latitude Float number Latitude of the location
     */
    @JsonProperty("latitude")
    var latitude: Double? = null
    /**
     * longitude Float number Longitude of the location
     */
    @JsonProperty("longitude")
    var longitude: Double? = null
    /**
     * live_period Integer Optional Period in seconds for which the location will be
     * updated (see Live Locations, should be between 60 and 86400
     */
    @JsonProperty("live_period")
    var livePeriod: Int? = null

    companion object {
        private const val METHOD = "sendLocation"
    }
}

