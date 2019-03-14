package io.github.oleksivio.telegram.bot.api.model.method.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [sendGame](https://core.telegram.org/bots/api.sendgame)
 */
class SendGame(actionNetworker: ActionNetworker) : ChatAction<Message>(METHOD, actionNetworker) {
    /**
     * game_short_name String Yes Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather.
     */
    @JsonProperty("game_short_name")
    var gameShortName: String? = null
    /**
     * reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard.
     * If empty, one ‘Play game_title’ button will be shown. If not empty, the first button must launch the game.
     */
    @JsonProperty("reply_markup")
    var replyMarkup: InlineKeyboardMarkup? = null
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a notification with
     * no sound.
     */
    @JsonProperty("disable_notification")
    var disableNotification: Boolean? = null
    /**
     * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    var replyToMessageId: Long? = null

    override val resultWrapperClass = MessageResponse::class

    companion object {
        private const val METHOD = "sendGame"
    }

}
