package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType

/**
 *  [MessageEntity](https://core.telegram.org/bots/api/#messageentity)
 */
data class MessageEntity(
        /**
         * To setup filter:
         *
         *  Type type type String Type of the entity. Can be mention
         */
        @JsonProperty("type")
        var type: String? = null,
        /**
         * offset Integer Offset in UTF-16 code units to the start of the entity
         */
        @JsonProperty("offset")
        var offset: Int? = null,
        /**
         * To setup filter:
         *
         *  IntegerFilter length length Integer Length of the entity in UTF-16 code units
         */
        @JsonProperty("length")
        var length: Int? = null,
        /**
         * To setup filter:
         *
         *  StringFilter url url [String] Optional. For “text_link” only, url that will be opened after user taps on the
         * text
         */
        @JsonProperty("url")
        var url: String? = null,
        /**
         * To setup filter:
         *
         *  UserFilter user user User Optional. For “text_mention” only, the mentioned user
         */
        @JsonProperty("user")
        var user: User? = null
) : ITelegram {
    enum class Type(override val stringName: String) : TelegramType {
        MENTION("mention"),
        HASHTAG("hashtag"),
        CASHTAG("cashtag"),
        BOT_COMMAND("bot_command"),
        URL("url"),
        EMAIL("email"),
        PHONE_NUMBER("phone_number"),
        BOLD_TEXT("bold"),
        ITALIC_TEXT("italic"),
        CODE("code"),
        PRE("pre"),
        TEXT_LINK("text_link"),
        TEXT_MENTION("text_mention"),
        ALL("");

        override val isChosen: Boolean
            get() = this != ALL
    }
} 
