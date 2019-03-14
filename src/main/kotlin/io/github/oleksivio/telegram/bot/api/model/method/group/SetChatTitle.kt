package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [setChatTitle](https://core.telegram.org/bots/api.setchattitle)
 */
class SetChatTitle(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {

    /**
     * title String New chat title, 1-255 characters
     */
    @JsonProperty("title")
    var title: String? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "setChatTitle"
    }

}
