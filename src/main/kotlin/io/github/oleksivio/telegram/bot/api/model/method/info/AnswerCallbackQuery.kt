package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [answerCallbackQuery](https://core.telegram.org/bots/api.answercallbackquery)
 */
class AnswerCallbackQuery(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {
    /**
     * callback_query_id String Unique identifier for the query to be answered
     */
    @JsonProperty("callback_query_id")
    var callbackQueryId: String? = null
    /**
     * text String Optional Text of the notification. If not specified, nothing will be shown to the
     * user, 0-200 characters
     */
    @JsonProperty("text")
    var text: String? = null
    /**
     * show_alert Boolean Optional If true, an alert will be shown by the client instead of a
     * notification at the top of the chat screen. Defaults to false.
     */
    @JsonProperty("show_alert")
    var showAlert: Boolean? = null
    /**
     * url String Optional URL that will be opened by the user's client. If you have created a
     * Game and accepted the conditions via @BotFather, specify the URL that opens your game – note
     * that this will only work if the query comes from a callback_game button.
     */
    @JsonProperty("url")
    var url: String? = null
    /**
     * cache_time Integer Optional The maximum amount of time in seconds that the result of the
     * callback query may be cached client-side. Telegram apps will support caching starting in
     * version 3.14. Defaults to 0.
     */
    @JsonProperty("cache_time")
    var cacheTime: Int? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "answerCallbackQuery"
    }
}
