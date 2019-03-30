package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [User](https://core.telegram.org/bots/api/#user)
 */
data class User(
        /**
         * id Integer Unique identifier for this user or bot
         */
        @JsonProperty("id")
        var id: Long = 0,
        /**
         * To setup filter:
         *
         *  StringFilter firstName first_name String User‘s or bot’s first name
         */
        @JsonProperty("first_name")
        var firstName: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter lastName last_name [String] Optional. User‘s or bot’s last name
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter username username [String] Optional. User‘s or bot’s username
         */
        @JsonProperty("username")
        var username: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter languageCode language_code [String] Optional. IETF language tag of the user's language
         */
        @JsonProperty("language_code")
        var languageCode: String? = null,
        /**
         * To setup filter:
         *
         *  BooleanFilter bot is_bot Boolean True, if this user is a bot
         */
        @JsonProperty("is_bot")
        var bot: Boolean? = null

) : ITelegram 
