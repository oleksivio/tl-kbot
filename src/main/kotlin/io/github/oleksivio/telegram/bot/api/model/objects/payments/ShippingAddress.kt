package io.github.oleksivio.telegram.bot.api.model.objects.payments

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [ShippingAddress](https://core.telegram.org/bots/api/#shippingaddress)
 */
data class ShippingAddress(
        /**
         * To setup filter:
         *
         * @see StringFilter countryCode country_code String ISO 3166-1 alpha-2 country code
         */
        @JsonProperty("country_code")
        var countryCode: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter state state String State, if applicable
         */
        @JsonProperty("state")
        var state: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter city city String City
         */
        @JsonProperty("city")
        var city: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter streetLine1 street_line1 String First line for the address
         */
        @JsonProperty("street_line1")
        var streetLine1: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter streetLine2 street_line2 String Second line for the address
         */
        @JsonProperty("street_line2")
        var streetLine2: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter postCode post_code String Address post code
         */
        @JsonProperty("post_code")
        var postCode: String? = null
) : ITelegram
