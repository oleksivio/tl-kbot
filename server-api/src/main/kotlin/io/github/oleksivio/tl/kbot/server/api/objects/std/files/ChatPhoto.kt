package io.github.oleksivio.tl.kbot.server.api.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [ChatPhoto](https://core.telegram.org/bots/api/#chatphoto)
 */
data class ChatPhoto(
        /**
         * small_file_id String Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo
         * download.
         */
        @JsonProperty("small_file_id")
        var smallFileId: String? = null,
        /**
         * big_file_id String Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo
         * download.
         */
        @JsonProperty("big_file_id")
        var bigFileId: String? = null
) : ITelegram
