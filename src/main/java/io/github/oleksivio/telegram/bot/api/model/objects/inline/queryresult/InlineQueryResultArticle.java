package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultarticle>InlineQueryResultArticle</a>
 */
public class InlineQueryResultArticle extends ContentInlineResult {
    private static final String TYPE = "article";
    /**
     * title String Title of the result
     */
    @JsonProperty("title")
    private String title = null;

    /**
     * url String Optional. URL of the result
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * hide_url Boolean Optional. Pass True, if you don't want the URL to be shown in the message
     */
    @JsonProperty("hide_url")
    private Boolean hideUrl = null;
    /**
     * description String Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description = null;
    /**
     * thumb_url String Optional. Url of the thumbnail for the result
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

    InlineQueryResultArticle() {
        super(TYPE);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getHideUrl() {
        return hideUrl;
    }

    public void setHideUrl(Boolean hideUrl) {
        this.hideUrl = hideUrl;
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
