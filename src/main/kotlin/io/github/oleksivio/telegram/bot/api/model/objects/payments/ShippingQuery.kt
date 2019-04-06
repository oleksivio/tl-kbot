package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom

/**
 *  [ShippingQuery](https://core.telegram.org/bots/api/#shippingquery)
 */
data class ShippingQuery(
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
         *  StringFilter invoicePayload invoice_payload String Bot specified invoice payload
         */
        @JsonProperty("invoice_payload")
        var invoicePayload: String? = null,
        /**
         * To setup filter:
         *
         *  ShippingAddressFilter shippingAddress shipping_address ShippingAddress User specified shipping address
         */
        @JsonProperty("shipping_address")
        var shippingAddress: ShippingAddress? = null
) : IUserFrom
