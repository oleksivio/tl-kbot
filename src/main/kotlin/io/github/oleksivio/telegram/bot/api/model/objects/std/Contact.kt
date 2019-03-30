package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [Contact](https://core.telegram.org/bots/api/#contact)
 */
data class Contact(
        /**
         * To setup filter:
         *
         *  StringFilter phoneNumber phone_number String Contact's phone number
         */
        @JsonProperty("phone_number")
        var phoneNumber: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter firstName first_name String Contact's first name
         */
        @JsonProperty("first_name")
        var firstName: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter lastName last_name [String] Optional. Contact's last name
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * To setup filter:
         *
         *  NotNullFilter userId user_id Integer Optional. Contact's user identifier in Telegram
         */
        @JsonProperty("user_id")
        var userId: Long? = null,
        /**
         * To setup filter:
         *
         *  StringFilter vCard vCard [String] Optional Additional data about the contact in the form of a vCard, 0-2048
         * bytes
         */
        @JsonProperty("vCard")
        var vCard: String? = null

) : ITelegram

