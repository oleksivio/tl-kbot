package io.github.oleksivio.tl.kbot.server.api.objects.inline

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.objects.IUserFrom
import io.github.oleksivio.tl.kbot.server.api.objects.std.Location
import io.github.oleksivio.tl.kbot.server.api.objects.std.User

/**
 *  [InlineQuery](https://core.telegram.org/bots/api/#inlinequery)
 */
data class InlineQuery(
    /**
     * id String Unique identifier for this query
     */
    @JsonProperty("id")
    var id: String? = null,
    /**
     * To setup filter:
     *
     *  UserFilter from from User Sender
     */
    @JsonProperty("from")
    override var from: User?,
    /**
     * To setup filter:
     *
     *  LocationFilter location location Location Optional. Sender location, only for bots that request user location
     */
    @JsonProperty("location")
    var location: Location? = null,
    /**
     * To setup filter:
     *
     *  StringFilter query query String Text of the query
     */
    @JsonProperty("query")
    var query: String? = null,
    /**
     * To setup filter:
     *
     *  StringFilter offset offset String Offset of the results to be returned, can be controlled by the bot
     */
    @JsonProperty("offset")
    var offset: String? = null
) : IUserFrom
