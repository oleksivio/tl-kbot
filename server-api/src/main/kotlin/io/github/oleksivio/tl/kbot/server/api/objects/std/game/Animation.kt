package io.github.oleksivio.tl.kbot.server.api.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.PhotoSize
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [Animation](https://core.telegram.org/bots/api/#animation)
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
         *  PhotoFilter thumb thumb PhotoSize Optional. Animation thumbnail as defined by sender
         */
        @JsonProperty("thumb")
        var thumb: PhotoSize? = null,
    /**
         * To setup filter:
         *
         *  StringFilter fileName file_name [String] Optional. Original animation filename as defined by sender
         */
        @JsonProperty("file_name")
        var fileName: String? = null,
    /**
         * To setup filter:
         *
         *  StringFilter mimeType mime_type [String] Optional. MIME type of the file as defined by sender
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
         *  IntegerFilter width width Integer Video width as defined by sender
         */
        @JsonProperty("width")
        var width: Int? = null,
    /**
         * To setup filter:
         *
         *  IntegerFilter height height Integer Video height as defined by sender
         */
        @JsonProperty("height")
        var height: Int? = null,
    /**
         * To setup filter:
         *
         *  IntegerFilter duration duration Integer Duration of the video in seconds as defined by sender
         */
        @JsonProperty("duration")
        var duration: Int? = null
) : ITelegram
