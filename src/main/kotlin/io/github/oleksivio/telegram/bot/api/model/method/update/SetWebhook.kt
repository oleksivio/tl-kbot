package io.github.oleksivio.telegram.bot.api.model.method.update

import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.CommonResponse
import io.github.oleksivio.telegram.bot.core.model.method.UploadFile
import org.springframework.core.io.FileSystemResource
import java.util.*

/**
 * @see [setWebhook](https://core.telegram.org/bots/api.setwebhook)
 */
class SetWebhook(fileNetworker: FileNetworker) : UploadFile<Boolean>(METHOD, fileNetworker) {

    override val resultWrapperClass = BooleanResponse::class

    fun setMaxConnections(maxConnections: Int?) {
        putInt(MAX_CONNECTIONS_KEY, maxConnections)
    }

    fun setAllowedUpdates(vararg allowedUpdates: Type) {
        val allowedStringUpdates = ArrayList<String>()

        for (type in allowedUpdates) {
            allowedStringUpdates.add(type.stringName())
        }
        putObject(ALLOWED_UPDATES_KEY, allowedStringUpdates)
    }

    fun setUrl(url: String) {
        putString(URL_KEY, url)
    }

    fun setCertificate(certificate: FileSystemResource) {
        putFile(CERTIFICATE_KEY, certificate)
    }

    enum class Type(private val typeName: String) {
        ALLOW_MESSAGE("message"),
        ALLOW_EDITED_MESSAGE("edited_message"),
        ALLOW_CHANNEL_POST("channel_post"),
        ALLOW_EDITED_CHANNEL_POST("edited_channel_post"),
        ALLOW_INLINE_QUERY("inline_query"),
        ALLOW_CHOSEN_INLINE_RESULT("chosen_inline_result"),
        ALLOW_CALLBACK_QUERY("callback_query"),
        ALLOW_SHIPPING_QUERY("shipping_query"),
        ALLOW_PRE_CHECKOUT_QUERY("pre_checkout_query");

        fun stringName(): String {
            return typeName
        }
    }

    companion object {
        private const val METHOD = "setWebhook"
        /**
         * url String HTTPS url to send updates to. Use an empty string to remove webhook
         * integration
         */
        private const val URL_KEY = "url"
        /**
         * certificate InputFile Optional Upload your public key certificate so that the root
         * certificate in use can be checked. See our self-signed guide for details.
         */
        private const val CERTIFICATE_KEY = "certificate"
        /**
         * max_connections Integer Optional Maximum allowed number of simultaneous HTTPS connections
         * to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load
         * on your bot‘s server, and higher values to increase your bot’s throughput.
         */
        private const val MAX_CONNECTIONS_KEY = "max_connections"
        /**
         * allowed_updates Array of String Optional List the types of updates you want your bot to
         * receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only
         * receive updates of these types. See Update for a complete list of available update types.
         * Specify an empty list to receive all updates regardless of type (default). If not specified,
         * the previous setting will be used.
         *
         *
         * Please note that this parameter doesn't affect updates created before the call to the
         * setWebhook, so unwanted updates may be received for a short period of time.
         */
        private const val ALLOWED_UPDATES_KEY = "allowed_updates"
    }
}
