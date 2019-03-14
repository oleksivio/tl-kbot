package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [sendChatAction](https://core.telegram.org/bots/api.sendchataction)
 */
class SendChatAction(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * action String Type of action to broadcast.
     * Choose one, depending on what the user is about to receive:
     * typing for text messages,
     * upload_photo for photos,
     * record_video or upload_video for videos,
     * record_audio or upload_audio for audio files,
     * upload_document for general files,
     * find_location for location data,
     * record_video_note or
     * upload_video_note for video notes.
     */
    @JsonProperty("action")
    var action: String? = null

    override val resultWrapperClass = BooleanResponse::class

    enum class Type constructor(val typeName: String) {
        ACTION_TYPING("typing"),
        ACTION_UPLOAD_PHOTO("upload_photo"),
        ACTION_RECORD_VIDEO("record_video"),
        ACTION_RECORD_AUDIO("record_audio"),
        ACTION_UPLOAD_DOCUMENT("upload_document"),
        ACTION_FIND_LOCATION("find_location"),
        ACTION_RECORD_VIDEO_NOTE("record_video_note"),
        ACTION_UPLOAD_VIDEO_NOTE("upload_video_note");

        fun stringName(): String {
            return typeName
        }
    }

    companion object {
        private const val METHOD = "sendChatAction"
    }
}
