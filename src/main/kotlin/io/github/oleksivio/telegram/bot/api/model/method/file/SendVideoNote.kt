package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.ThumbAction

/**
 * @see [sendVideoNote](https://core.telegram.org/bots/api.sendvideonote)
 */
class SendVideoNote(actionNetworker: ActionNetworker) : ThumbAction(METHOD, actionNetworker) {
    /**
     * video_note String Video note to send. Pass a file_id as String to send a
     * video note that exists on the Telegram servers (recommended).
     * Sending video notes by a URL is currently unsupported
     */
    @JsonProperty("video_note")
    var videoNote: String? = null
    /**
     * duration Integer Optional Duration of sent video in seconds
     */
    @JsonProperty("duration")
    var duration: Int? = null
    /**
     * length Integer Optional Video width and height
     */
    @JsonProperty("length")
    var length: Int? = null

    companion object {
        private const val METHOD = "sendVideoNote"
    }
}
