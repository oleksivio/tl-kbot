package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.file.ThumbAction

/**
 * @see [sendAudio](https://core.telegram.org/bots/api.sendaudio)
 */
class SendAudio(actionNetworker: ActionNetworker) : ThumbAction(METHOD, actionNetworker) {
    /**
     * audio  String   Audio file to send. Pass a file_id as String to send an audio file that exists on the Telegram
     * servers (recommended), pass an HTTP URL as a String for Telegram to get an audio file from the Internet, or upload
     * a new one using multipart/form-data.
     */
    @JsonProperty("audio")
    var audio: String? = null

    /**
     * duration Integer Optional Duration of the audio in seconds
     */
    @JsonProperty("duration")
    var duration: Int? = null
    /**
     * performer String Optional Performer
     */
    @JsonProperty("performer")
    var performer: String? = null
    /**
     * title String Optional Track name
     */
    @JsonProperty("title")
    var title: String? = null

    companion object {
        private const val METHOD = "sendAudio"
    }

}
