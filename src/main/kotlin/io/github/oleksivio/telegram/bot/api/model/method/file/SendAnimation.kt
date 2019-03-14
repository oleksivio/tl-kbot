package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.ThumbAction

/**
 * @see [sendAnimation](https://core.telegram.org/bots/api.sendanimation)
 */
class SendAnimation(actionNetworker: ActionNetworker) : ThumbAction(METHOD, actionNetworker) {
    /**
     * animation String Yes Animation to send. Pass a file_id as String to send an animation that exists on
     * the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the
     * Internet, or upload a new animation using multipart/form-data.
     */
    @JsonProperty("animation")
    var animation: String? = null
    /**
     * duration Integer Optional Duration of sent animation in seconds
     */
    @JsonProperty("duration")
    var duration: Int? = null
    /**
     * width Integer Optional Animation width
     */
    @JsonProperty("width")
    var width: Int? = null
    /**
     * height Integer Optional Animation height
     */
    @JsonProperty("height")
    var height: Int? = null

    companion object {
        private const val METHOD = "sendAnimation"
    }

}
