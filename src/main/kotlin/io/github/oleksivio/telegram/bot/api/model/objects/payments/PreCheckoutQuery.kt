package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.OrderInfoFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.UserFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom

/**
 *  [PreCheckoutQuery](https://core.telegram.org/bots/api/#precheckoutquery)
 */
data class PreCheckoutQuery(
        /**
         * id String Unique query identifier
         */
        @JsonProperty("id")
        var id: String? = null,
        /**
         * To setup filter:
         *
         *  UserFilter from from User User who sent the query
         */
        @JsonProperty("from")
        override var from: User?,
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
         *  StringFilter totalAmount total_amount Integer Total price in the smallest units of the currency
         */
        @JsonProperty("total_amount")
        var totalAmount: Int? = null,
        /**
         * To setup filter:
         *
         *  StringFilter invoicePayload invoice_payload String Bot specified invoice payload
         */
        @JsonProperty("invoice_payload")
        var invoicePayload: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter shippingOptionId shipping_option_id [String] Optional. Identifier of the shipping option chosen by
         * the user
         */
        @JsonProperty("shipping_option_id")
        var shippingOptionId: String? = null,
        /**
         * To setup filter:
         *
         *  OrderInfoFilter orderInfo order_info OrderInfo Optional. Order info provided by the user
         */
        @JsonProperty("order_info")
        var orderInfo: OrderInfo? = null
) : IUserFrom
