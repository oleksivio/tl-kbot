package io.github.oleksivio.telegram.bot.api.model.method.payments

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingOption
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [answerShippingQuery](https://core.telegram.org/bots/api/#answershippingquery)
 */
class AnswerShippingQuery(
        /**
         * shipping_query_id String Yes Unique identifier for the query to be answered
         */
        @JsonProperty("shipping_query_id")
        val shippingQueryId: String,
        /**
         * ok Boolean Yes Specify True if delivery to the specified address is possible and False
         * if there are any problems (for example, if delivery to the specified address is not possible)
         */
        @JsonProperty("ok")
        val ok: Boolean,
        /**
         * shipping_options Array of ShippingOption Optional Required if ok is True. A JSON-serialized array of available
         * shipping options.
         */
        @JsonProperty("shipping_options")
        val shippingOptions: List<ShippingOption>? = null,
        /**
         * error_message String Optional Required if ok is False. Error message in human readable form that explains
         * why it is impossible to complete the order (e.g. "Sorry, delivery to your desired address is unavailable').
         * Telegram will display this message to the user.
         */
        @JsonProperty("error_message")
        val errorMessage: String? = null
) : Action<Boolean>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "answerShippingQuery"
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

}
