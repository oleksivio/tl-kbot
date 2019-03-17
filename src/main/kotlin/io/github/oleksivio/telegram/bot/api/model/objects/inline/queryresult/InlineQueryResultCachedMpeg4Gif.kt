package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultCachedMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultcachedmpeg4gif)
 */
class InlineQueryResultCachedMpeg4Gif(
        /**
         * mpeg4_file_id String A valid file identifier for the MP4 file
         */
        @JsonProperty("mpeg4_file_id")
        var mpeg4FileId: String,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "mpeg4_gif"

) : TitledInlineResult()
