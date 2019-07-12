package io.github.oleksivio.tl.kbot.server.api.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [OrderInfo](https://core.telegram.org/bots/api/#orderinfo)
 */
data class OrderInfo(
    /**
     * To setup filter:
     *
     *  StringFilter name name [String] Optional. User name
     */
    @JsonProperty("name")
    var name: String? = null,
    /**
     * To setup filter:
     *
     *  StringFilter phoneNumber phone_number [String] Optional. User's phone number
     */
    @JsonProperty("phone_number")
    var phoneNumber: String? = null,
    /**
     * To setup filter:
     *
     *  StringFilter email email [String] Optional. User email
     */
    @JsonProperty("email")
    var email: String? = null,
    /**
     * To setup filter:
     *
     *  ShippingAddressFilter  shippingAddress shipping_address ShippingAddress Optional. User shipping address
     */
    @JsonProperty("shipping_address")
    var shippingAddress: ShippingAddress? = null
) : ITelegram
