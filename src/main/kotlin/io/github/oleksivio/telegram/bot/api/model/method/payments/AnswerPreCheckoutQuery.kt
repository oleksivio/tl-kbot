package io.github.oleksivio.telegram.bot.api.model.method.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [answerPreCheckoutQuery](https://core.telegram.org/bots/api.answerprecheckoutquery)
 */
class AnswerPreCheckoutQuery(actionNetworker: ActionNetworker) : RunnableAction<Boolean>(METHOD, actionNetworker) {
    /**
     * pre_checkout_query_id String Yes Unique identifier for the query to be answered
     */
    @JsonProperty("pre_checkout_query_id")
    var preCheckoutQueryId: String? = null
    /**
     * ok Boolean Yes Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
     */
    @JsonProperty("ok")
    var ok: Boolean? = null
    /**
     * error_message String Optional Required if ok is False. Error message in human readable form that explains the reason for failure to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts while you were busy filling out your payment details. Please choose a different color or garment!"). Telegram will display this message to the user.
     */
    @JsonProperty("error_message")
    var errorMessage: String? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "answerPreCheckoutQuery"
    }

}
