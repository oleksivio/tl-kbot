package io.github.oleksivio.telegram.bot.api.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.FormattedMessageAction

/**
 * @see [sendMessage](https://core.telegram.org/bots/api.sendmessage)
 */
class SendMessage(actionNetworker: ActionNetworker) : FormattedMessageAction(METHOD, actionNetworker) {
    /**
     * text String Text of the message to be sent
     */
    @JsonProperty("text")
    var text: String? = null
    /**
     * disable_web_page_preview Boolean Optional Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    var disableWebPagePreview: Boolean? = null

    companion object {
        private const val METHOD = "sendMessage"
    }

}
