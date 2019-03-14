package io.github.oleksivio.telegram.bot.core.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [editMessageText](https://core.telegram.org/bots/api.editmessagetext)
 */
abstract class EditMessageText<RES> protected constructor(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {
    /**
     * text String New text of the message
     */
    @JsonProperty("text")
    var text: String? = null
    /**
     * parse_mode String Optional Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    var parseMode: String? = null
    /**
     * disable_web_page_preview Boolean Optional Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    var disableWebPagePreview: Boolean? = null

    companion object {
        private const val METHOD = "editMessageText"
    }

}
