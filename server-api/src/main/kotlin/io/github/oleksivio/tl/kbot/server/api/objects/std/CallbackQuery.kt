package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.objects.IUserFrom

/**
 *  [CallbackQuery](https://core.telegram.org/bots/api/#callbackquery)
 */
data class CallbackQuery(
    /**
         * id String Unique identifier for this query
         */
        @JsonProperty("id")
        var id: String? = null,
    /**
         * To setup filter:
         *
         *  UserFilter from from User Sender
         */
        @JsonProperty("from")
        override var from: User?,
    /**
         * To setup filter:
         *
         *  MessageFilter message message Message Optional. Message with the callback button that originated the query.
         * Note that message content and message date will not be available if the message is too old
         */
        @JsonProperty("message")
        var message: Message? = null,
    /**
         * To setup filter:
         *
         *  StringFilter inlineMessageId inline_message_id [String] Optional. Identifier of the message sent via the bot in
         * inline mode, that originated the query.
         */
        @JsonProperty("inline_message_id")
        var inlineMessageId: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter chatInstance chat_instance String Global identifier, uniquely corresponding to the chat to which
         * the message with the callback button was sent. Useful for high scores in games.
         */
        @JsonProperty("chat_instance")
        var chatInstance: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter data data [String] Optional. Data associated with the callback button. Be aware that a bad client
         * can send arbitrary data in this field.
         */
        @JsonProperty("data")
        var data: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter gameShortName game_short_name [String] Optional. Short name of a Game to be returned, serves as the
         * unique identifier for the game
         */
        @JsonProperty("game_short_name")
        var gameShortName: String? = null
) : IUserFrom
