package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InlineQueryResultCachedDocument](https://core.telegram.org/bots/api.inlinequeryresultcacheddocument)
 */
class InlineQueryResultCachedDocument(
        /**
         * document_file_id String A valid file identifier for the file
         */
        @JsonProperty("document_file_id")
        var document_file_id: String? = null,
        /**
         * description String Optional. Short description of the result
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "document"
) : TitledInlineResult()
