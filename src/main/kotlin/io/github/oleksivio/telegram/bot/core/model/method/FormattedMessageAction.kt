package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker

abstract class FormattedMessageAction protected constructor(method: String, actionNetworker: ActionNetworker) : MessageAction(method, actionNetworker) {
    /**
     * parse_mode String Optional Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    var parseMode: String? = null

}
