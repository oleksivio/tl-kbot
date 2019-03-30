package io.github.oleksivio.telegram.bot.api.model.method.game

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [sendGame](https://core.telegram.org/bots/api/#sendgame)
 */
data class SendGame(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * game_short_name String Yes Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather.
         */
        @JsonProperty(ApiDict.GAME_SHORT_NAME_KEY)
        val gameShortName: String,
        /**
         * reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard.
         * If empty, one ‘Play game_title’ button will be shown. If not empty, the first button must launch the game.
         */
        @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
        val replyMarkup: InlineKeyboardMarkup? = null,
        /**
         * disable_notification [Boolean] OptionalSends the message silently. Users will receive a notification with
         * no sound.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
         */
        @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
        val replyToMessageId: Long? = null
) : ChatAction<Message>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendGame"

    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}


