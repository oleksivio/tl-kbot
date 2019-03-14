package io.github.oleksivio.telegram.bot.api.model.method.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.MessageAction

/**
 * @see [sendSticker](https://core.telegram.org/bots/api.sendsticker)
 */
class SendSticker(actionNetworker: ActionNetworker) : MessageAction(METHOD, actionNetworker) {
    /**
     * sticker String Yes Sticker to send. Pass a file_id as String to send a file that exists on the
     * Telegram servers (recommended) or pass an HTTP URL as a String for Telegram to get a .webp file from the Internet
     */
    @JsonProperty("sticker")
    var sticker: String? = null

    companion object {
        private const val METHOD = "sendSticker"
    }

}
