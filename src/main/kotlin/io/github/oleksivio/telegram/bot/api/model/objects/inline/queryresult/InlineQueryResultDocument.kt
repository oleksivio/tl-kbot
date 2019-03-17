package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultDocument](https://core.telegram.org/bots/api/#inlinequeryresultdocument)
 */
data class InlineQueryResultDocument(
        /**
         * document_url String A valid URL for the file
         */
        @JsonProperty("document_url")
        var documentUrl: String,
        /**
         * mime_type String Mime type of the content of the file, either “application/pdf” or “application/zip”
         */
        @JsonProperty("mime_type")
        var mimeType: String,
        /**
         * description String Optional. Short description of the result
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * thumb_url String Optional. URL of the thumbnail (jpeg only) for the file
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
        val type: String = "document"
) : TitledInlineResult()
