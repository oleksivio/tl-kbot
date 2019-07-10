package io.github.oleksivio.tl.kbot.server.api.method.notify

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action

/**
 * @see [https://core.telegram.org/bots/api/#answercallbackquery]
 */
data class AnswerCallbackQuery(
        /**
         * callback_query_id String Unique identifier for the query to be answered
         */
        @JsonProperty(ApiDict.CALLBACK_QUERY_ID_KEY)
        val callbackQueryId: String,
        /**
         * text [String] Optional Text of the notification. If not specified, nothing will be shown to the
         * user, 0-200 characters
         */
        @JsonProperty(ApiDict.TEXT_KEY)
        val text: String? = null,
        /**
         * show_alert [Boolean] Optional If true, an alert will be shown by the client instead of a
         * notification at the top of the chat screen. Defaults to false.
         */
        @JsonProperty(ApiDict.SHOW_ALERT_KEY)
        val showAlert: Boolean? = null,
        /**
         * url [String] Optional URL that will be opened by the user's client. If you have created a
         * Game and accepted the conditions via @BotFather, specify the URL that opens your game – note
         * that this will only work if the query comes from a callback_game button.
         */
        @JsonProperty(ApiDict.URL_KEY)
        val url: String? = null,
        /**
         * cache_time [Int] Optional The maximum amount of time in seconds that the result of the
         * callback query may be cached client-side. Telegram apps will support caching starting in
         * version 3.14. Defaults to 0.
         */
        @JsonProperty(ApiDict.CACHE_TIME_KEY)
        val cacheTime: Int? = null
) : Action<Boolean>() {
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "answerCallbackQuery"

}
