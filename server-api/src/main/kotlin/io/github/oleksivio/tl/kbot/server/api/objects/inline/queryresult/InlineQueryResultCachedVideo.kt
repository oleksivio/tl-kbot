package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultCachedVideo](https://core.telegram.org/bots/api/#inlinequeryresultcachedvideo)
 */
data class InlineQueryResultCachedVideo(
        /**
         * video_file_id String A valid file identifier for the video file
         */
        @JsonProperty("video_file_id")
        var videoFileId: String,
        /**
         * description [String] Optional. Short description of the result
         */
        @JsonProperty("description")
        var description: String? = null,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "video"
) : TitledInlineResult()
