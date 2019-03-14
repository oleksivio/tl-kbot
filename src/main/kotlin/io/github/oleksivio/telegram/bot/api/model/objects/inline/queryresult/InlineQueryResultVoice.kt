package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultVoice](https://core.telegram.org/bots/api.inlinequeryresultvoice)
 */
data class InlineQueryResultVoice(
        /**
         * voice_url String A valid URL for the voice recording
         */
        @JsonProperty("voice_url")
        var voiceUrl: String? = null,

        /**
         * voice_duration Integer Optional. Recording duration in seconds
         */
        @JsonProperty("voice_duration")
        var voiceDuration: Int? = null,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "voice"

) : TitledInlineResult()
