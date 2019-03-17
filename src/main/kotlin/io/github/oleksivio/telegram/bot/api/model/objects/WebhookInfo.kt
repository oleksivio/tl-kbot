package io.github.oleksivio.telegram.bot.api.model.objects

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import java.util.*

/**
 * @see [WebhookInfo](https://core.telegram.org/bots/api/#webhookinfo)
 */
data class WebhookInfo(
        /**
         * url String Webhook URL, may be empty if webhook is not set up has_custom_certificate Boolean True, if a custom
         * certificate was provided for webhook certificate checks
         */
        @JsonProperty("url")
        var url: String? = null,
        /**
         * pending_update_count Integer Number of updates awaiting delivery
         */
        @JsonProperty("pending_update_count")
        var pendingUpdateCount: Int? = null,
        /**
         * last_error_date Integer Optional. Unix time for the most recent error that happened when trying to deliver an
         * update via webhook
         */
        @JsonProperty("last_error_date")
        var lastErrorDate: Long? = null,
        /**
         * last_error_message String Optional. Error message in human-readable format for the most recent error that happened
         * when trying to deliver an update via webhook
         */
        @JsonProperty("last_error_message")
        var lastErrorMessage: String? = null,
        /**
         * max_connections Integer Optional. Maximum allowed number of simultaneous HTTPS connections to the webhook for
         * update delivery
         */
        @JsonProperty("max_connections")
        var maxConnections: Int? = null,
        /**
         * allowed_updates Array of String
         */
        @JsonProperty("allowed_updates")
        var allowedUpdates: List<String> = ArrayList()
) : ITelegram 
