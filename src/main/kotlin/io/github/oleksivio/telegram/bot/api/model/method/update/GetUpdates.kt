package io.github.oleksivio.telegram.bot.api.model.method.update

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.UpdatesArrayResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getUpdates](https://core.telegram.org/bots/api.getupdates)
 */
class GetUpdates(actionNetworker: ActionNetworker) : RunnableAction<List<Update>>(METHOD, actionNetworker) {
    /**
     * offset Integer Optional Identifier of the first update to be returned. Must be greater by one than the highest among the identifiers of previously received updates. By default, updates starting with the earliest unconfirmed update are returned. An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id. The negative offset can be specified to longPolling updates starting from -offset update from the end of the updates queue. All previous updates will forgotten.
     */
    @JsonProperty("offset")
    var offset: Int? = null
    /**
     * limit Integer Optional Limits the number of updates to be retrieved. Values between 1—100 are accepted.
     * Defaults to 100.
     */
    @JsonProperty("limit")
    var limit: Int? = null
    /**
     * timeout Integer Optional Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling.
     * Should be positive, short polling should be used for testing purposes only.
     */
    @JsonProperty("timeout")
    var timeout: Int? = null
    /**
     * allowed_updates Array of String Optional List the types of updates you want your bot to receive.
     * For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive updates of these types.
     * See Update for a complete list of available update types.
     * Specify an empty list to receive all updates regardless of type (default).
     * If not specified (null), the previous setting will be used.
     *
     *
     * Please note that this parameter doesn't affect updates created before the call to the getUpdates, so unwanted
     * updates may be received for a short period of time.
     */
    @JsonProperty("allowed_updates")
    var allowedUpdates: List<String>? = null

    override val resultWrapperClass = UpdatesArrayResponse::class

    companion object {
        private const val METHOD = "getUpdates"
    }

}
