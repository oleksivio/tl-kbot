package io.github.oleksivio.tl.kbot.server.api.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [PhotoSize](https://core.telegram.org/bots/api/#photosize)
 */
data class PhotoSize(
        /**
         * file_id String Unique identifier for this files
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * To setup filter:
         *
         *  IntegerFilter width width Integer Photo width
         */
        @JsonProperty("width")
        var width: Int? = null,
        /**
         * To setup filter:
         *
         *  IntegerFilter height height Integer Photo height
         */
        @JsonProperty("height")
        var height: Int? = null,
        /**
         * To setup filter:
         *
         *  IntegerFilter fileSize file_size Integer Optional. File size
         */
        @JsonProperty("file_size")
        var fileSize: Int? = null
) : ITelegram
