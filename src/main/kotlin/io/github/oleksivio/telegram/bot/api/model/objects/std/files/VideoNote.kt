package io.github.oleksivio.telegram.bot.api.model.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [VideoNote](https://core.telegram.org/bots/api/#videonote)
 */
data class VideoNote(
        /**
         * file_id String Unique identifier for this files
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter length length Integer Video width and height as defined by sender
         */
        @JsonProperty("length")
        var length: Int? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter duration duration Integer Duration of the video in seconds as defined by sender
         */
        @JsonProperty("duration")
        var duration: Int? = null,
        /**
         * To setup filter:
         *
         * @see PhotoFilter thumb thumb PhotoSize Optional. Video thumbnail
         */
        @JsonProperty("thumb")
        var thumb: PhotoSize? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter fileSize file_size Integer Optional. File size
         */
        @JsonProperty("file_size")
        var fileSize: Int? = null
) : ITelegram 
