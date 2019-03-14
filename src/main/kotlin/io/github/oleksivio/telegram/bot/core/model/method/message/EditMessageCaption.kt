package io.github.oleksivio.telegram.bot.core.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [editMessageCaption](https://core.telegram.org/bots/api.editmessagecaption)
 */
abstract class EditMessageCaption<RES> protected constructor(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {
    /**
     * caption String Optional New caption of the message
     */
    @JsonProperty("caption")
    val caption: String? = null
    /**
     * parse_mode String Optional Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    val parseMode: String? = null

    companion object {
        private const val METHOD = "editMessageCaption"
    }

}
