package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultCachedAudio](https://core.telegram.org/bots/api/#inlinequeryresultcachedaudio)
 */
class InlineQueryResultCachedAudio(
        /**
         * audio_file_id String A valid file identifier for the audio file
         */
        @JsonProperty("audio_file_id")
        var audioFileId: String? = null,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "audio"
) : FormattedInlineResult()
