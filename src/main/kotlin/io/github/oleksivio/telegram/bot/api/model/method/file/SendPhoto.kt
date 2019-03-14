package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.CaptionAction

/**
 * @see [sendPhoto](https://core.telegram.org/bots/api.sendphoto)
 */
class SendPhoto(actionNetworker: ActionNetworker) : CaptionAction(METHOD, actionNetworker) {
    /**
     * photo  String  Photo to send. Pass a file_id as String to send a photo that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a photo from the Internet
     */
    @JsonProperty("photo")
    var photo: String? = null

    companion object {
        private const val METHOD = "sendPhoto"
    }

}
