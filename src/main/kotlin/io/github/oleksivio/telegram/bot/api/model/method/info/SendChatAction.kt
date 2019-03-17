package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [sendChatAction](https://core.telegram.org/bots/api/#sendchataction)
 */
class SendChatAction(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
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
        @JsonProperty(ApiDict.ACTION_KEY)
        val action: String

) : ChatAction<Boolean>() {
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    object Type {
        const val ACTION_TYPING = "typing"
        const val ACTION_UPLOAD_PHOTO = "upload_photo"
        const val ACTION_RECORD_VIDEO = "record_video"
        const val ACTION_RECORD_AUDIO = "record_audio"
        const val ACTION_UPLOAD_DOCUMENT = "upload_document"
        const val ACTION_FIND_LOCATION = "find_location"
        const val ACTION_RECORD_VIDEO_NOTE = "record_video_note"
        const val ACTION_UPLOAD_VIDEO_NOTE = "upload_video_note"
    }

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendChatAction"

}
