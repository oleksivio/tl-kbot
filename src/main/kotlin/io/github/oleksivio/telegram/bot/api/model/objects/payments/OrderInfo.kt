package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [OrderInfo](https://core.telegram.org/bots/api/#orderinfo)
 */
data class OrderInfo(
        /**
         * To setup filter:
         *
         * @see StringFilter name name String Optional. User name
         */
        @JsonProperty("name")
        var name: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter phoneNumber phone_number String Optional. User's phone number
         */
        @JsonProperty("phone_number")
        var phoneNumber: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter email email String Optional. User email
         */
        @JsonProperty("email")
        var email: String? = null,
        /**
         * To setup filter:
         *
         * @see ShippingAddressFilter  shippingAddress shipping_address ShippingAddress Optional. User shipping address
         */
        @JsonProperty("shipping_address")
        var shippingAddress: ShippingAddress? = null
) : ITelegram
