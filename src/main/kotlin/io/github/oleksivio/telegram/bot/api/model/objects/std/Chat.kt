package io.github.oleksivio.telegram.bot.api.model.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.ChatPhoto
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import io.github.oleksivio.telegram.bot.core.model.type.TelegramType

/**
 * To setup filter:
 *
 *  ChatFilter chat
 *
 *  [Chat](https://core.telegram.org/bots/api/#chat)
 */
data class Chat(
        /**
         * id Integer Unique identifier for this chat. This number may be greater than 32 bits and some programming languages
         * may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer
         * or double-precision float type are safe for storing this identifier.
         */
        @JsonProperty("id")
        var id: Long = 0,
        /**
         * To setup filter:
         *
         *  Type type type String Type of chat, can be either “private”, “group”, “supergroup” or “channel”
         */
        @JsonProperty("type")
        var type: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter title title [String] Optional. Title, for supergroups, channels and group chats
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter username username [String] Optional. Username, for private chats, supergroups and channels if
         * available
         */
        @JsonProperty("username")
        var username: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter firstName first_name [String] Optional. First name of the other party in a private chat
         */
        @JsonProperty("first_name")
        var firstName: String? = null,
        /**
         * To setup filter:
         *
         *  StringFilter lastName last_name [String] Optional. Last name of the other party in a private chat
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * To setup filter:
         *
         *  BooleanFilter allMembersAreAdministrators all_members_are_administrators Boolean Optional. True if a group has
         * ‘All Members Are Admins’ enabled.
         */
        @JsonProperty("all_members_are_administrators")
        var allMembersAreAdmin: Boolean? = null,
        /**
         * photo ChatPhoto Optional. Chat photo. Returned only in getChat.
         */
        @JsonProperty("photo")
        var chatPhoto: ChatPhoto? = null,
        /**
         * description [String] Optional. Description, for supergroups and channel chats. Returned only in getChat.
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * invite_link [String] Optional. Chat invite link, for supergroups and channel chats. Returned only in getChat.
         */
        @JsonProperty("invite_link")
        var inviteLink: String? = null,
        /**
         * pinned_message Message Optional. Pinned message, for supergroups and channel chats. Returned only in getChat.
         */
        @JsonProperty("pinned_message")
        var pinnedMessage: Message? = null,
        /**
         * sticker_set_name [String] Optional. For supergroups, name of group sticker set. Returned only in getChat.
         */
        @JsonProperty("sticker_set_name")
        var sticerSetName: String? = null,
        /**
         * can_set_sticker_set Boolean Optional. True, if the bot can change the group sticker set. Returned only in getChat.
         */
        @JsonProperty("can_set_sticker_set")
        var canSetStickerSet: Boolean? = null
) : ITelegram {

    object Const {
        const val PRIVATE = "private"
        const val GROUP = "group"
        const val SUPERGROUP = "supergroup"
        const val CHANNEL = "channel"
    }

    enum class Type(override val typeName: String) : TelegramType {
        PRIVATE(Const.PRIVATE),
        GROUP(Const.GROUP),
        SUPERGROUP(Const.SUPERGROUP),
        CHANNEL(Const.CHANNEL),
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
