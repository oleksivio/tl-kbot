package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultCachedSticker](https://core.telegram.org/bots/api/#inlinequeryresultcachedsticker)
 */
class InlineQueryResultCachedSticker(
        /**
         * sticker_file_id String A valid file identifier of the sticker
         */
        @JsonProperty("sticker_file_id")
        var stickerFileId: String,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "sticker"
) : ContentInlineResult()
