package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultdocument">InlineQueryResultDocument</a>
 */
public class InlineQueryResultDocument extends TitledInlineResult {
    private static final String TYPE = "document";
    /**
     * document_url String A valid URL for the file
     */
    @JsonProperty("document_url")
    private String documentUrl = null;
    /**
     * mime_type String Mime type of the content of the file, either “application/pdf” or “application/zip”
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * description String Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description = null;
    /**
     * thumb_url String Optional. URL of the thumbnail (jpeg only) for the file
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;
    /**
     * thumb_width Integer Optional. Thumbnail width
     */
    @JsonProperty("thumb_width")
    private Integer thumbWidth = null;
    /**
     * thumb_height Integer Optional. Thumbnail height
     */
    @JsonProperty("thumb_height")
    private Integer thumbHeight = null;

    InlineQueryResultDocument() {
        super(TYPE);
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }
}
