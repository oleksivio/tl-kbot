package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Contact](https://core.telegram.org/bots/api.contact)
 */
data class Contact(
        /**
         * To setup filter:
         *
         * @see StringFilter phoneNumber phone_number String Contact's phone number
         */
        @JsonProperty("phone_number")
        var phoneNumber: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter firstName first_name String Contact's first name
         */
        @JsonProperty("first_name")
        var firstName: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter lastName last_name String Optional. Contact's last name
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * To setup filter:
         *
         * @see NotNullFilter userId user_id Integer Optional. Contact's user identifier in Telegram
         */
        @JsonProperty("user_id")
        var userId: Long? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter vCard vCard String Optional Additional data about the contact in the form of a vCard, 0-2048
         * bytes
         */
        @JsonProperty("vCard")
        var vCard: String? = null

) : ITelegram

