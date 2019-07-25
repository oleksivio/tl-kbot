package io.github.oleksivio.tl.kbot.server.api.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [Voice](https://core.telegram.org/bots/api/#voice)
 */
data class Voice(
    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    var fileId: String? = null,
    /**
     * To setup filter:
     *
     *  IntegerFilter duration duration Integer Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    var duration: Int? = null,
    /**
     * To setup filter:
     *
     *  StringFilter mimeType mime_type [String] Optional. MIME type of the files as defined by sender
     */
    @JsonProperty("mime_type")
    var mimeType: String? = null,
    /**
     * To setup filter:
     *
     *  IntegerFilter fileSize file_size Integer Optional. File size
     */
    @JsonProperty("file_size")
    var fileSize: Int? = null
) : ITelegram
