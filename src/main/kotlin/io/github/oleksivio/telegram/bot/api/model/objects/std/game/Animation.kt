package io.github.oleksivio.telegram.bot.api.model.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Animation](https://core.telegram.org/bots/api/#animation)
 */
data class Animation(
        /**
         * file_id String Unique file identifier
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * To setup filter:
         *
         * @see PhotoFilter thumb thumb PhotoSize Optional. Animation thumbnail as defined by sender
         */
        @JsonProperty("thumb")
        var thumb: PhotoSize? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter fileName file_name String Optional. Original animation filename as defined by sender
         */
        @JsonProperty("file_name")
        var fileName: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter mimeType mime_type String Optional. MIME type of the file as defined by sender
         */
        @JsonProperty("mime_type")
        var mimeType: String? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter fileSize file_size Integer Optional. File size
         */
        @JsonProperty("file_size")
        var fileSize: Int? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter width width Integer Video width as defined by sender
         */
        @JsonProperty("width")
        var width: Int? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter height height Integer Video height as defined by sender
         */
        @JsonProperty("height")
        var height: Int? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter duration duration Integer Duration of the video in seconds as defined by sender
         */
        @JsonProperty("duration")
        var duration: Int? = null
) : ITelegram
