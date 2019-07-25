package io.github.oleksivio.tl.kbot.server.api.objects.inline

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.objects.IUserFrom
import io.github.oleksivio.tl.kbot.server.api.objects.std.Location
import io.github.oleksivio.tl.kbot.server.api.objects.std.User

/**
 *  [ChosenInlineResult](https://core.telegram.org/bots/api/#choseninlineresult)
 */
data class ChosenInlineResult(
    /**
     * result_id String The unique identifier for the result that was chosen
     */
    @JsonProperty("result_id")
    var resultId: String? = null,
    /**
     * To setup filter:
     *
     *  UserFilter from from User The user that chose the result
     */
    @JsonProperty("from")
    override var from: User?,
    /**
     * To setup filter:
     *
     *  LocationFilter location location Location Optional. Sender location, only for bots that require user location
     */
    @JsonProperty("location")
    var location: Location? = null,
    /**
     * To setup filter:
     *
     *  StringFilter inlineMessageId inline_message_id [String] Optional. Identifier of the sent inline message.
     * Available only if there is an inline keyboard attached to the message. Will be also received in callback queries
     * and can be used to message the message.
     */
    @JsonProperty("inline_message_id")
    var inlineMessageId: String? = null,
    /**
     * To setup filter:
     *null
     *  StringFilter query query String The query that was used to obtain the result
     */
    @JsonProperty("query")
    var query: String? = null
) : IUserFrom
