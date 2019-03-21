package io.github.oleksivio.telegram.bot.api.model.method.game

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.MessageResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [setGameScore](https://core.telegram.org/bots/api/#setgamescore)
 */
data class SetGameScore(
        /**
         * user_id Integer Yes Target user id
         */
        @JsonProperty(ApiDict.USER_ID_KEY)
        val userId: Long,
        /**
         * score Integer Yes New score, must be non-negative
         */
        @JsonProperty(ApiDict.SCORE_KEY)
        val score: Int,
        /**
         * force Boolean Optional Pass True, if the high score is allowed to decrease. This can be useful when fixing
         * mistakes or banning cheaters
         */
        @JsonProperty(ApiDict.FORCE_KEY)
        val force: Boolean? = null,
        /**
         * disable_edit_message Boolean Optional Pass True, if the game message should not be automatically edited to
         * include the current scoreboard
         */
        @JsonProperty(ApiDict.DISABLE_EDIT_MESSAGE_KEY)
        val disableEditMessage: Boolean? = null,
        /**
         * chat_id	Integer	Optional	Required if inline_message_id is not specified. Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long? = null,

        /**
         * message_id Integer Optional Required if inline_message_id is not specified. Identifier of the sent message
         */
        @JsonProperty(ApiDict.MESSAGE_ID_KEY)
        val messageId: Long? = null,
        /**
         * inline_message_id String Optional Required if chat_id and message_id are not specified. Identifier of the inline
         * message
         */
        @JsonProperty(ApiDict.INLINE_MESSAGE_ID_KEY)
        val inlineMessageId: String? = null
) : ChatAction<Message>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setGameScore"

    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}


