package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcacheddocument">InlineQueryResultCachedDocument</a>
 */
public class InlineQueryResultCachedDocument extends TitledInlineResult {
    private static final String TYPE = "document";
    /**
     * document_file_id String A valid file identifier for the file
     */
    @JsonProperty("document_file_id")
    private String document_file_id = null;
    /**
     * description String Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description = null;

    InlineQueryResultCachedDocument() {
        super(TYPE);
    }

    public String getDocument_file_id() {
        return document_file_id;
    }

    public void setDocument_file_id(String document_file_id) {
        this.document_file_id = document_file_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
