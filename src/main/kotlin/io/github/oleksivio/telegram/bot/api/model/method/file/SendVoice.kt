package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.CaptionAction

/**
 * @see [sendVoice](https://core.telegram.org/bots/api.sendvoice)
 */
class SendVoice(actionNetworker: ActionNetworker) : CaptionAction(METHOD, actionNetworker) {
    /**
     * voice  String Audio file to send. Pass a file_id as String to send a file
     * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a file from the Internet
     */
    @JsonProperty("voice")
    var voice: String? = null
    /**
     * duration Integer Optional Duration of the voice message in seconds
     */
    @JsonProperty("duration")
    var duration: Int? = null

    companion object {
        private const val METHOD = "sendVoice"
    }
}
