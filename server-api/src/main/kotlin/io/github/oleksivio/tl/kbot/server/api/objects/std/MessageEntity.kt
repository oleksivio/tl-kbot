package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import io.github.oleksivio.tl.kbot.server.api.model.type.TelegramType

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

    object Const {
        const val MENTION = "mention"
        const val HASHTAG = "hashtag"
        const val CASHTAG = "cashtag"
        const val BOT_COMMAND = "bot_command"
        const val URL = "url"
        const val EMAIL = "email"
        const val PHONE_NUMBER = "phone_number"
        const val BOLD_TEXT = "bold"
        const val ITALIC_TEXT = "italic"
        const val CODE = "code"
        const val PRE = "pre"
        const val TEXT_LINK = "text_link"
        const val TEXT_MENTION = "text_mention"
    }

    enum class Type(override val typeName: String) : TelegramType {
        MENTION(Const.MENTION),
        HASHTAG(Const.HASHTAG),
        CASHTAG(Const.CASHTAG),
        BOT_COMMAND(Const.BOT_COMMAND),
        URL(Const.URL),
        EMAIL(Const.EMAIL),
        PHONE_NUMBER(Const.PHONE_NUMBER),
        BOLD_TEXT(Const.BOLD_TEXT),
        ITALIC_TEXT(Const.ITALIC_TEXT),
        CODE(Const.CODE),
        PRE(Const.PRE),
        TEXT_LINK(Const.TEXT_LINK),
        TEXT_MENTION(Const.TEXT_MENTION),
        UNKNOWN("");

        override val isChosen: Boolean
            get() = this != UNKNOWN

        companion object {
            fun parse(input: String?): Type {
                return values().firstOrNull { it.typeName == input } ?: UNKNOWN
            }
        }

    }
} 
