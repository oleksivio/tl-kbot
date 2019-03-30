package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultCachedGif](https://core.telegram.org/bots/api/#inlinequeryresultcachedgif)
 */
class InlineQueryResultCachedGif(
        /**
         * gif_file_id String A valid file identifier for the GIF file
         */
        @JsonProperty("gif_file_id")
        var gifFileId: String,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "gif"

) : TitledInlineResult()

