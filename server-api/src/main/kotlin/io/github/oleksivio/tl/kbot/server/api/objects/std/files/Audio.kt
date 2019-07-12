package io.github.oleksivio.tl.kbot.server.api.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [Audio](https://core.telegram.org/bots/api/#audio)
 */
data class Audio(

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
     *  StringFilter performer performer [String] Optional. Performer of the audio as defined by sender or by audio tags
     */
    @JsonProperty("performer")
    var performer: String? = null,
    /**
     * To setup filter:
     *
     *  StringFilter title title [String] Optional. Title of the audio as defined by sender or by audio tags
     */
    @JsonProperty("title")
    var title: String? = null,
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
    var fileSize: Int? = null,
    /**
     * To setup filter:
     *
     *  PhotoFilter thumb thumb PhotoSize Optional. Thumbnail of the album cover to which the music file belongs
     */
    @JsonProperty("thumb")
    var thumb: PhotoSize? = null
) : ITelegram
