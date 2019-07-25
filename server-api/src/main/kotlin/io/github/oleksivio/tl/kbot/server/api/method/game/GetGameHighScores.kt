package io.github.oleksivio.tl.kbot.server.api.method.game

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.GameHighScoresResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.game.GameHighScore

/**
 * @see [getGameHighScores](https://core.telegram.org/bots/api/#getgamehighscores)
 */
data class GetGameHighScores(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
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
