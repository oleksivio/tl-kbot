package io.github.oleksivio.tl.kbot.server.api.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.common.MessageAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [sendSticker](https://core.telegram.org/bots/api/#sendsticker)
 */
data class SendSticker(
    /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: ChatId,
    /**
         * sticker String Yes Sticker to send. Pass a file_id as String to send a file that exists on the
         * Telegram servers (recommended) or pass an HTTP URL as a String for Telegram to get a .webp file from the Internet
         */
        @JsonProperty(ApiDict.STICKER_KEY)
        val sticker: InputFile,
    /**
         * disable_notification [Boolean] OptionalSends the message silently. Users will receive a notification with no sound.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        override val disableNotification: Boolean? = null,
    /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
        override val replyToMessageId: Long? = null,
    /**
         * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
         */
        @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
        override val replyMarkup: IKeyboard? = null

) : MessageAction() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendSticker"

}
