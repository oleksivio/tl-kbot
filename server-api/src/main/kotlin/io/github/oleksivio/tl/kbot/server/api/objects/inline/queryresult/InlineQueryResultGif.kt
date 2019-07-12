package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultGif](https://core.telegram.org/bots/api/#inlinequeryresultgif)
 */
data class InlineQueryResultGif(
    /**
     * gif_url String A valid URL for the GIF file. File size must not exceed 1MB
     */
    @JsonProperty("gif_url")
    var gifUrl: String,
    /**
     * gif_width Integer Optional. Width of the GIF
     */
    @JsonProperty("gif_width")
    var gifWidth: Int? = null,
    /**
     * gif_height Integer Optional. Height of the GIF
     */
    @JsonProperty("gif_height")
    var gifHeight: Int? = null,
    /**
     * gif_duration Integer Optional. Duration of the GIF
     */
    @JsonProperty("gif_duration")
    var gifDuration: Int? = null,
    /**
     * thumb_url String URL of the static thumbnail for the result (jpeg or gif)
     */
    @JsonProperty("thumb_url")
    var thumbUrl: String,

    /**
     * type String Type of the result
     */
    @JsonProperty("type")
    val type: String = "gif"
) : TitledInlineResult()
