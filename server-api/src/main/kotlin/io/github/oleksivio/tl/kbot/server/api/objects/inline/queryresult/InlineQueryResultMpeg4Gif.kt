package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultMpeg4Gif](https://core.telegram.org/bots/api/#inlinequeryresultmpeg4gif)
 */
data class InlineQueryResultMpeg4Gif(
        /**
         * mpeg4_url String A valid URL for the MP4 file. File size must not exceed 1MB
         */
        @JsonProperty("mpeg4_url")
        var mpeg4Url: String,
        /**
         * mpeg4_width Integer Optional. Video width
         */
        @JsonProperty("mpeg4_width")
        var mpeg4Width: Int? = null,
        /**
         * mpeg4_height Integer Optional. Video height
         */
        @JsonProperty("mpeg4_height")
        var mpeg4Height: Int? = null,
        /**
         * mpeg4_duration Integer Optional. Video duration
         */
        @JsonProperty("mpeg4_duration")
        var mpeg4Duration: Int? = null,
        /**
         * thumb_url String URL of the static thumbnail (jpeg or gif) for the result
         */
        @JsonProperty("thumb_url")
        var thumbUrl: String,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "mpeg4gif"
) : TitledInlineResult()
