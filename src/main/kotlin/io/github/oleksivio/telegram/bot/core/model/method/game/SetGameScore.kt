package io.github.oleksivio.telegram.bot.core.model.method.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [setGameScore](https://core.telegram.org/bots/api.setgamescore)
 */
abstract class SetGameScore<RES>(actionNetworker: ActionNetworker) : ChatAction<RES>(METHOD, actionNetworker) {
    /**
     * score Integer Yes New score, must be non-negative
     */
    @JsonProperty("score")
    var score: Int? = null
    /**
     * force Boolean Optional Pass True, if the high score is allowed to decrease. This can be useful when fixing
     * mistakes or banning cheaters
     */
    @JsonProperty("force")
    var force: Boolean? = null
    /**
     * disable_edit_message Boolean Optional Pass True, if the game message should not be automatically edited to
     * include the current scoreboard
     */
    @JsonProperty("disable_edit_message")
    var disableEditMessage: Boolean? = null

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
     * inline_message_id String Optional Required if chat_id and message_id are not specified. Identifier of the inline
     * message
     */
    @JsonProperty("inline_message_id")
    var inlineMessageId: String? = null

    companion object {
        private val METHOD = "setGameScore"
    }

}
