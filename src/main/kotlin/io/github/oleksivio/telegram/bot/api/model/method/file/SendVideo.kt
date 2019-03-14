package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.ThumbAction

/**
 * @see [sendVideo](https://core.telegram.org/bots/api.sendvideo)
 */
class SendVideo(actionNetworker: ActionNetworker) : ThumbAction(METHOD, actionNetworker) {
    /**
     * video  String Video to send. Pass a file_id as String to send a video that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a video from the Internet
     */
    @JsonProperty("video")
    var video: String? = null

    /**
     * duration Integer Optional Duration of sent video in seconds
     */
    @JsonProperty("duration")
    var duration: Int? = null
    /**
     * width Integer Optional Video width
     */
    @JsonProperty("width")
    var width: Int? = null
    /**
     * height Integer Optional Video height
     */
    @JsonProperty("height")
    var height: Int? = null
    /**
     * supports_streaming Boolean Optional Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    var supportsStreaming: Boolean? = null

    companion object {
        private const val METHOD = "sendVideo"
    }

}
