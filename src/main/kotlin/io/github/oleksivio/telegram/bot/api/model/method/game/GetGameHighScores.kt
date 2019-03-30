package io.github.oleksivio.telegram.bot.api.model.method.game

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.GameHighScore
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.GameHighScoresResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [getGameHighScores](https://core.telegram.org/bots/api/#getgamehighscores)
 */
data class GetGameHighScores(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * user_id Integer Yes Target user id
         */
        @JsonProperty(ApiDict.USER_ID_KEY)
        val userId: Long,
        /**
         * message_id [Integer] OptionalRequired if inline_message_id is not specified. Identifier of the sent message
         */
        @JsonProperty(ApiDict.MESSAGE_ID_KEY)
        val messageId: Long? = null,
        /**
         * inline_message_id [String] Optional Required if chat_id and message_id are not specified. Identifier of the inline message
         */
        @JsonProperty(ApiDict.INLINE_MESSAGE_ID_KEY)
        val inlineMessageId: String? = null
) : ChatAction<List<GameHighScore>>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getGameHighScores"

    @JsonIgnore
    override val resultWrapperClass = GameHighScoresResponse::class
}
