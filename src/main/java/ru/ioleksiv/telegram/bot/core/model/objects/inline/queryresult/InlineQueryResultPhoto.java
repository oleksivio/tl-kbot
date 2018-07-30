package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultphoto>InlineQueryResultPhoto</a>
 */
public class InlineQueryResultPhoto extends TitledInlineResult {
    private static final String TYPE = "photo";
    /**
     * photo_url	String	A valid URL of the photo. Photo must be in jpeg format. Photo size must not exceed 5MB
     */
    @JsonProperty("photoUrl;")
    private String photoUrl;
    /**
     * thumb_url	String	URL of the thumbnail for the photo
     */
    @JsonProperty("thumb_url")
    private String thumbUrl;
    /**
     * photo_width	Integer	Optional. Width of the photo
     */
    @JsonProperty("photo_width")
    private Integer photoWidth;
    /**
     * photo_height	Integer	Optional. Height of the photo
     */
    @JsonProperty("photo_height")
    private Integer photoHeight;
    /**
     * description	String	Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description;
    InlineQueryResultPhoto() {
        super(TYPE);
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getPhotoWidth() {
        return photoWidth;
    }

    public void setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public void setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
