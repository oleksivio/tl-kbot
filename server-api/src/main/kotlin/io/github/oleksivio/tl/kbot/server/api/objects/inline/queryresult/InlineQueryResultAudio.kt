package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultAudio](https://core.telegram.org/bots/api/#inlinequeryresultaudio)
 */
data class InlineQueryResultAudio(
        /**
         * audio_url String A valid URL for the audio file
         */
        @JsonProperty("audio_url")
        var audioUrl: String? = null,
        /**
         * performer [String] Optional. Performer
         */
        @JsonProperty("performer")
        var performer: String? = null,
        /**
         * audio_duration Integer Optional. Audio duration in seconds
         */
        @JsonProperty("audio_duration")
        var audioDuration: Int? = null,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "audio"
) : TitledInlineResult()
