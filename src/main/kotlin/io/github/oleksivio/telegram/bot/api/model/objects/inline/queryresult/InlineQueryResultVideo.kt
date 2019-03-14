package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultVideo](https://core.telegram.org/bots/api.inlinequeryresultvideo)
 */
data class InlineQueryResultVideo(
        /**
         * video_url String A valid URL for the embedded video player or video file
         */
        @JsonProperty("video_url")
        var videoUrl: String,
        /**
         * mime_type String Mime type of the content of video url, “text/html” or “video/mp4”
         */
        @JsonProperty("mime_type")
        var mimeType: String,
        /**
         * thumb_url String URL of the thumbnail (jpeg only) for the video
         */
        @JsonProperty("thumb_url")
        var thumbUrl: String,
        /**
         * video_width Integer Optional. Video width
         */
        @JsonProperty("video_width")
        var videoWidth: Int? = null,
        /**
         * video_height Integer Optional. Video height
         */
        @JsonProperty("video_height")
        var videoHeight: Int? = null,
        /**
         * video_duration Integer Optional. Video duration in seconds
         */
        @JsonProperty("video_duration")
        var videoDuration: Int? = null,
        /**
         * description String Optional. Short description of the result
         */
        @JsonProperty("description")
        var description: String? = null,

        /**
         * type String Type of the result
         */
        @JsonProperty("type")
         val type: String  = "video"

): TitledInlineResult()
