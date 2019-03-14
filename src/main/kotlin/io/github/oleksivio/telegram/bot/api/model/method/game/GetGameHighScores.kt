package io.github.oleksivio.telegram.bot.api.model.method.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.GameHighScore
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.GameHighScoresResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [getGameHighScores](https://core.telegram.org/bots/api.getgamehighscores)
 */
class GetGameHighScores(actionNetworker: ActionNetworker) : ChatAction<List<GameHighScore>>(METHOD, actionNetworker) {

    /**
     * user_id Integer Yes Target user id
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * message_id Integer Optional Required if inline_message_id is not specified. Identifier of the sent message
     */
    @JsonProperty("message_id")
    var messageId: Long? = null
    /**
     * inline_message_id String Optional Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    var inlineMessageId: String? = null

    override val resultWrapperClass = GameHighScoresResponse::class

    companion object {
        private const val METHOD = "getGameHighScores"
    }

}
