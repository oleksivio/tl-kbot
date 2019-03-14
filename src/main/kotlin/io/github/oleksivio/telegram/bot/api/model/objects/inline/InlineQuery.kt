package io.github.oleksivio.telegram.bot.api.model.objects.inline

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.Location
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom

/**
 * @see [InlineQuery](https://core.telegram.org/bots/api.inlinequery)
 */
data class InlineQuery(
        /**
         * id String Unique identifier for this query
         */
        @JsonProperty("id")
        var id: String? = null,
        /**
         * To setup filter:
         *
         * @see UserFilter from from User Sender
         */
        @JsonProperty("from")
        override var from: User = User(),
        /**
         * To setup filter:
         *
         * @see LocationFilter location location Location Optional. Sender location, only for bots that request user location
         */
        @JsonProperty("location")
        var location: Location? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter query query String Text of the query
         */
        @JsonProperty("query")
        var query: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter offset offset String Offset of the results to be returned, can be controlled by the bot
         */
        @JsonProperty("offset")
        var offset: String? = null
) : IUserFrom
