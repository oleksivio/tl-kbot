package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.OrderInfoFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [SuccessfulPayment](https://core.telegram.org/bots/api/#successfulpayment)
 */
data class SuccessfulPayment(
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
         *  NotNullFilter shippingOptionId shipping_option_id [String] Optional. Identifier of the shipping option chosen by
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
        var orderInfo: OrderInfo? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter telegramPaymentChargeId telegram_payment_charge_id String Telegram payment identifier
         */
        @JsonProperty("telegram_payment_charge_id")
        var telegramPaymentChargeId: String? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter providerPaymentChargeId provider_payment_charge_id String Provider payment identifier
         */
        @JsonProperty("provider_payment_charge_id")
        var providerPaymentChargeId: String? = null
) : ITelegram
