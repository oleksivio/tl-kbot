package io.github.oleksivio.telegram.bot.api.model.objects.passport

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [PassportFile](https://core.telegram.org/bots/api/#passportfile)
 */
data class PassportFile(
        /**
         * file_id String Unique identifier for this file
         */
        @JsonProperty("file_id")
        var fileId: String? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter fileSize file_size Integer File size
         */
        @JsonProperty("file_size")
        var fileSize: Int? = null,
        /**
         * To setup filter:
         *
         * @see IntegerFilter fileDate file_date Integer Unix time when the file was uploaded
         */
        @JsonProperty("file_date")
        var fileDate: Int? = null
) : ITelegram
