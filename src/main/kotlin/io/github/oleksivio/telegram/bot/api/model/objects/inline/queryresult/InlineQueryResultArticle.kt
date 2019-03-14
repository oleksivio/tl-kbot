package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultArticle](https://core.telegram.org/bots/api.inlinequeryresultarticle)
 */
class InlineQueryResultArticle(
        /**
         * title String Title of the result
         */
        @JsonProperty("title")
        var title: String,
        /**
         * url String Optional. URL of the result
         */
        @JsonProperty("url")
        var url: String? = null,
        /**
         * hide_url Boolean Optional. Pass True, if you don't want the URL to be shown in the message
         */
        @JsonProperty("hide_url")
        var hideUrl: Boolean? = null,
        /**
         * description String Optional. Short description of the result
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * thumb_url String Optional. Url of the thumbnail for the result
         */
        @JsonProperty("thumb_url")
        var thumbUrl: String? = null,
        /**
         * thumb_width Integer Optional. Thumbnail width
         */
        @JsonProperty("thumb_width")
        var thumbWidth: Int? = null,
        /**
         * thumb_height Integer Optional. Thumbnail height
         */
        @JsonProperty("thumb_height")
        var thumbHeight: Int? = null,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "article"
) : ContentInlineResult()
