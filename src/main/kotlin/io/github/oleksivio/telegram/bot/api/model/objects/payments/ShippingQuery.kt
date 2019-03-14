package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom

/**
 * @see [ShippingQuery](https://core.telegram.org/bots/api.shippingquery)
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
         * @see UserFilter from from User User who sent the query
         */
        @JsonProperty("from")
        override var from: User = User(),
        /**
         * To setup filter:
         *
         * @see StringFilter invoicePayload invoice_payload String Bot specified invoice payload
         */
        @JsonProperty("invoice_payload")
        var invoicePayload: String? = null,
        /**
         * To setup filter:
         *
         * @see ShippingAddressFilter shippingAddress shipping_address ShippingAddress User specified shipping address
         */
        @JsonProperty("shipping_address")
        var shippingAddress: ShippingAddress? = null
) : IUserFrom
