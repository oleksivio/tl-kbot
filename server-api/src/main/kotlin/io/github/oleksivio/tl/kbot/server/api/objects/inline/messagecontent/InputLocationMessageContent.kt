package io.github.oleksivio.tl.kbot.server.api.objects.inline.messagecontent

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InputLocationMessageContent](https://core.telegram.org/bots/api/#inputlocationmessagecontent)
 */
data class InputLocationMessageContent(
    /**
     * latitude Float number Latitude of the location
     */
    @JsonProperty("latitude")
    var latitude: Double? = null,
    /**
     * longitude Float number Longitude of the location
     */
    @JsonProperty("longitude")
    var longitude: Double? = null,
    /**
     * live_period [Integer] OptionalPeriod in seconds for which the location will be updated (see Live Locations, should
     * be between 60 and 86400
     */
    @JsonProperty("live_period")
    var livePeriod: Int? = null
) : InputMessageContent
