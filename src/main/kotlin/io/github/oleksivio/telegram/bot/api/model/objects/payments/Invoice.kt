package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [Invoice](https://core.telegram.org/bots/api/#invoice)
 */
data class Invoice(
        /**
         * To setup filter:
         *
         *  StringFilter title title String Product name
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter description description String Product description
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter startParameter start_parameter String Unique bot deep-linking parameter that can be used to
         * generate this invoice
         */
        @JsonProperty("start_parameter")
        var startParameter: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter currency currency String Three-letter ISO 4217 currency code
         */
        @JsonProperty("currency")
        var currency: String? = null,
        /**
         * To setup filter:
         *
         *  IntegerFilter totalAmount total_amount Integer Total price in the smallest units of the currency
         */
        @JsonProperty("total_amount")
        var totalAmount: Int? = null
) : ITelegram 
