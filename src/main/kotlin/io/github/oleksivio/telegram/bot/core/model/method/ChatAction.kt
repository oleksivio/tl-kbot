package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker

abstract class ChatAction<RES>
protected constructor(method: String, actionNetworker: ActionNetworker)
    : RunnableAction<RES>(method, actionNetworker) {
    /**
     * chat_id Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    var chatId: Long? = null

}
