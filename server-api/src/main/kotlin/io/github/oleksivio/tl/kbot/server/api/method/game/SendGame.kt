package io.github.oleksivio.tl.kbot.server.api.method.game

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.MessageResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.InlineKeyboardMarkup

/**
 * @see [sendGame](https://core.telegram.org/bots/api/#sendgame)
 */
data class SendGame(
    /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: ChatId,
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


