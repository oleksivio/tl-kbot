package io.github.oleksivio.telegram.bot.api.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [deleteMessage](https://core.telegram.org/bots/api.deletemessage)
 */
class DeleteMessage(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {

    /**
     * message_id Integer Identifier of the message to delete
     */
    @JsonProperty("message_id")
    var messageId: Long? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "deleteMessage"
    }

}
