package io.github.oleksivio.telegram.bot.api.model.method.payments

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [answerPreCheckoutQuery](https://core.telegram.org/bots/api/#answerprecheckoutquery)
 */
data class AnswerPreCheckoutQuery(
        /**
         * pre_checkout_query_id String Yes Unique identifier for the query to be answered
         */
        @JsonProperty("pre_checkout_query_id")
        val preCheckoutQueryId: String,
        /**
         * ok Boolean Yes Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
         */
        @JsonProperty("ok")
        val ok: Boolean? = null,
        /**
         * error_message [String] Optional Required if ok is False. Error message in human readable form that explains the reason for failure to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts while you were busy filling out your payment details. Please choose a different color or garment!"). Telegram will display this message to the user.
         */
        @JsonProperty("error_message")
        val errorMessage: String? = null
) : Action<Boolean>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "answerPreCheckoutQuery"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class
}
