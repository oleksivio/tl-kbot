package io.github.oleksivio.telegram.bot.api.model.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [Document](https://core.telegram.org/bots/api/#document)
 */
data class Document(

        /**
         * file_id String Unique identifier for this files
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * To setup filter:
         *
         *  PhotoFilter thumb thumb PhotoSize Optional. Document thumbnail as defined by sender
         */
        @JsonProperty("thumb")
        var thumb: PhotoSize? = null,
        /**
         * To setup filter:
         *
         *  StringFilter fileName file_name [String] Optional. Original filename as defined by sender
         */
        @JsonProperty("file_name")
        var fileName: String? = null,
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
