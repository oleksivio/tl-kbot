package io.github.oleksivio.tl.kbot.server.api.method.update

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.UpdatesArrayResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.Update

/**
 * @see [getUpdates](https://core.telegram.org/bots/api/#getupdates)
 */
data class GetUpdates(
    /**
     * offset [Integer] OptionalIdentifier of the first update to be returned. Must be greater by one than the highest among the identifiers of previously received updates. By default, updates starting with the earliest unconfirmed update are returned. An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id. The negative offset can be specified to longPolling updates starting from -offset update from the end of the updates queue. All previous updates will forgotten.
     */
    @JsonProperty(ApiDict.OFFSET_KEY)
    val offset: Int? = null,
    /**
     * limit [Integer] OptionalLimits the number of updates to be retrieved. Values between 1—100 are accepted.
     * Defaults to 100.
     */
    @JsonProperty(ApiDict.LIMIT_KEY)
    val limit: Int? = null,
    /**
     * timeout [Integer] OptionalTimeout in seconds for long polling. Defaults to 0, i.e. usual short polling.
     * Should be positive, short polling should be used for testing purposes only.
     */
    @JsonProperty(ApiDict.TIMEOUT_KEY)
    val timeout: Int? = null,
    /**
     * allowed_updates Array of [String] Optional List the types of updates you want your bot to receive.
     * For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive updates of these types.
     * See Update for a complete list of available update types.
     * Specify an empty list to receive all updates regardless of type (default).
     * If not specified (null), the previous setting will be used.
     *
     *
     * Please note that this parameter doesn't affect updates created before the call to the getUpdates, so unwanted
     * updates may be received for a short period of time.
     */
    @JsonProperty(ApiDict.ALLOWED_UPDATES_KEY)
    val allowedUpdates: List<String>? = null
) : Action<List<Update>>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method: String = "getUpdates"

    @JsonIgnore
    override val resultWrapperClass = UpdatesArrayResponse::class
}
