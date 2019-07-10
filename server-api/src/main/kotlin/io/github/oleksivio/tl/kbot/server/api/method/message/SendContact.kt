package io.github.oleksivio.tl.kbot.server.api.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.common.MessageAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard

/**
 * @see [sendContact](https://core.telegram.org/bots/api/#sendcontact)
 */
class SendContact(
    /**
         * chat_id Integer or String Yes Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: ChatId,
    /**
         * phone_number String Contact's phone number
         */
        @JsonProperty(ApiDict.PHONE_NUMBER_KEY)
        val phoneNumber: String,
    /**
         * first_name String Contact's first name
         */
        @JsonProperty(ApiDict.FIRST_NAME_KEY)
        val firstName: String,
    /**
         * last_name [String] Optional Contact's last name
         */
        @JsonProperty(ApiDict.LAST_NAME_KEY)
        val lastName: String? = null,
    /**
         * vcard [String] Optional Additional data about the contact in the form of a vCard, 0-2048 bytes
         */
        @JsonProperty(ApiDict.VCARD_KEY)
        val vcard: String? = null,
    /**
         *reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove keyboard or to force a reply from the user.
         */
        override val replyMarkup: IKeyboard? = null,
    /**
         * disable_notification [Boolean] OptionalSends the message silently. Users will receive a notification with no sound.
         */
        override val disableNotification: Boolean? = null,
    /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        override val replyToMessageId: Long? = null
) : MessageAction() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendContact"
}
