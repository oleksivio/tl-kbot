package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultCachedVoice](https://core.telegram.org/bots/api/#inlinequeryresultcachedvoice)
 */
class InlineQueryResultCachedVoice(
        /**
         * voice_file_id String A valid file identifier for the voice message
         */
        @JsonProperty("voice_file_id")
        var voiceFileId: String,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "voice"
) : TitledInlineResult()
