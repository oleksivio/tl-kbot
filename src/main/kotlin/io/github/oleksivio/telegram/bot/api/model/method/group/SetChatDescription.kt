package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [setChatDescription](https://core.telegram.org/bots/api.setchatdescription)
 */
class SetChatDescription(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * description String Optional New chat description, 0-255 characters
     */
    @JsonProperty("description")
    var description: String? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "setChatDescription"
    }

}
