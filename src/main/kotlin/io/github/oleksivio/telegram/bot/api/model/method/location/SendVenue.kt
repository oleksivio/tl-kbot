package io.github.oleksivio.telegram.bot.api.model.method.location

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.MessageAction

/**
 * @see [sendVenue](https://core.telegram.org/bots/api.sendvenue)
 */
class SendVenue(actionNetworker: ActionNetworker) : MessageAction(METHOD, actionNetworker) {
    /**
     * latitude Float number Latitude of the venue
     */
    @JsonProperty("latitude")
    var latitude: Double? = null
    /**
     * longitude Float number Longitude of the venue
     */
    @JsonProperty("longitude")
    var longitude: Double? = null
    /**
     * title String Name of the venue
     */
    @JsonProperty("title")
    var title: String? = null
    /**
     * address String Address of the venue
     */
    @JsonProperty("address")
    var address: String? = null
    /**
     * foursquare_id String Optional Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    var foursquareId: String? = null
    /**
     * foursquare_type String Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    var foursquareType: String? = null

    companion object {
        private const val METHOD = "sendVenue"
    }
}
