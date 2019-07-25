package io.github.oleksivio.tl.kbot.server.api.method.update

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.model.type.NamedType
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [setWebhook](https://core.telegram.org/bots/api/#setwebhook)
 */
data class SetWebhook(
    /**
     * url String HTTPS url to send updates to. Use an empty string to remove webhook
     * integration
     */
    @JsonProperty(ApiDict.URL_KEY)
    val url: String,
    /**
     * certificate InputFile Optional Upload your public key certificate so that the root
     * certificate in use can be checked. See our self-signed guide for details.
     */
    @JsonProperty(ApiDict.CERTIFICATE_KEY)
    val certificate: InputFile? = null,
    /**
     * max_connections [Integer] Optional Maximum allowed number of simultaneous HTTPS connections
     * to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
     * on your bot‘s server, and higher values to increase your bot’s throughput.
     */
    @JsonProperty(ApiDict.MAX_CONNECTIONS_KEY)
    val maxConnections: Int? = null,
    /**
     * allowed_updates Array of [String] Optional List the types of updates you want your bot to
     * receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only
     * receive updates of these types. See Update for a complete list of available update types.
     * Specify an empty list to receive all updates regardless of type (default). If not specified,
     * the previous setting will be used.
     *
     *
     * Please note that this parameter doesn't affect updates created before the call to the
     * setWebhook, so unwanted updates may be received for a short period of time.
     */
    @JsonProperty(ApiDict.ALLOWED_UPDATES_KEY)
    val allowedUpdates: MutableList<out Type>? = null
) : Action<Boolean>() {


    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setWebhook"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    enum class Type(override val typeName: String) : NamedType {
        ALLOW_MESSAGE("message"),
        ALLOW_EDITED_MESSAGE("edited_message"),
        ALLOW_CHANNEL_POST("channel_post"),
        ALLOW_EDITED_CHANNEL_POST("edited_channel_post"),
        ALLOW_INLINE_QUERY("inline_query"),
        ALLOW_CHOSEN_INLINE_RESULT("chosen_inline_result"),
        ALLOW_CALLBACK_QUERY("callback_query"),
        ALLOW_SHIPPING_QUERY("shipping_query"),
        ALLOW_PRE_CHECKOUT_QUERY("pre_checkout_query");
    }
}
