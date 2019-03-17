package io.github.oleksivio.telegram.bot.api.model.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [File](https://core.telegram.org/bots/api/#files)
 */
data class File(
        /**
         * file_id String Unique identifier for this file
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * file_size Integer Optional. File size, if known
         */
        @JsonProperty("file_size")
        var fileSize: Int? = null,
        /**
         * file_path String Optional. File path.
         * Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.
         */
        @JsonProperty("file_path")
        var filePath: String? = null
) : ITelegram 
