package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedphoto>InlineQueryResultCachedPhoto</a>
 */
public class InlineQueryResultCachedPhoto extends TitledInlineResult {
    private static final String TYPE = "photo";
    /**
     * photo_file_id String A valid file identifier of the photo
     */
    @JsonProperty("photo_file_id")
    private String photoFileId = null;
    /**
     * description String Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description = null;

    InlineQueryResultCachedPhoto() {
        super(TYPE);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoFileId() {
        return photoFileId;
    }

    public void setPhotoFileId(String photoFileId) {
        this.photoFileId = photoFileId;
    }
}
