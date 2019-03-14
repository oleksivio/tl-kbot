package io.github.oleksivio.telegram.bot.core.model.method

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse

abstract class UploadMessageFile protected constructor(method: String, networker: FileNetworker) : UploadFile<Message>(method, networker) {

    override val resultWrapperClass = MessageResponse::class

    protected fun putReplyMarkup(keyboard: IKeyboard) {
        putObject(REPLY_MARKUP_KEY, keyboard)
    }

    companion object {
        /**
         * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
         * Optional Additional interface options. A JSON-serialized object for an inline keyboard,
         * custom reply keyboard, instructions to remove reply keyboard or to force a reply
         * from the user.
         */
        private const val REPLY_MARKUP_KEY = "reply_markup"
        /**
         * disable_notification Boolean Optional Sends the message silently. Users will receive a
         * notification with no sound.
         */
        const val DISABLE_NOTIFICATION_KEY = "disable_notification"
        /**
         * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
         */
        const val REPLY_TO_MESSAGE_ID = "reply_to_message_id"
        /**
         * chat_id Integer or String Unique identifier for the target chat or username of the
         * target channel (in the format @channelusername)
         */
        const val CHAT_ID_KEY = "chat_id"
    }
}
