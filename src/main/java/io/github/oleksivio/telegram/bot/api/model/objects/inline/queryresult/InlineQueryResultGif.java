package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultgif>InlineQueryResultGif</a>
 */
public class InlineQueryResultGif extends TitledInlineResult {
    private static final String TYPE = "gif";
    /**
     * gif_url String A valid URL for the GIF file. File size must not exceed 1MB
     */
    @JsonProperty("gif_url")
    private String gifUrl = null;
    /**
     * gif_width Integer Optional. Width of the GIF
     */
    @JsonProperty("gif_width")
    private Integer gifWidth = null;
    /**
     * gif_height Integer Optional. Height of the GIF
     */
    @JsonProperty("gif_height")
    private Integer gifHeight = null;
    /**
     * gif_duration Integer Optional. Duration of the GIF
     */
    @JsonProperty("gif_duration")
    private Integer gifDuration = null;
    /**
     * thumb_url String URL of the static thumbnail for the result (jpeg or gif)
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;

    InlineQueryResultGif() {
        super(TYPE);
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    public Integer getGifWidth() {
        return gifWidth;
    }

    public void setGifWidth(Integer gifWidth) {
        this.gifWidth = gifWidth;
    }

    public Integer getGifHeight() {
        return gifHeight;
    }

    public void setGifHeight(Integer gifHeight) {
        this.gifHeight = gifHeight;
    }

    public Integer getGifDuration() {
        return gifDuration;
    }

    public void setGifDuration(Integer gifDuration) {
        this.gifDuration = gifDuration;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }
}
