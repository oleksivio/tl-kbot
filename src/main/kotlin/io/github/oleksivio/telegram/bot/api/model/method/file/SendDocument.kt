package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.ThumbAction

/**
 * @see [sendDocument](https://core.telegram.org/bots/api.senddocument)
 */
class SendDocument(actionNetworker: ActionNetworker) : ThumbAction(METHOD, actionNetworker) {

    /**
     * document  String  File to send. Pass a file_id as String to send a file that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a file from the Internet
     */
    @JsonProperty("document")
    var document: String? = null

    companion object {
        private const val METHOD = "sendDocument"
    }

}
