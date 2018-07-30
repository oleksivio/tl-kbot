package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultmpeg4gif>InlineQueryResultMpeg4Gif</a>
 */
public class InlineQueryResultMpeg4Gif extends TitledInlineResult {
    private static final String TYPE = "mpeg4gif";
    /**
     * mpeg4_url	String	A valid URL for the MP4 file. File size must not exceed 1MB
     */
    @JsonProperty("mpeg4_url")
    private String mpeg4Url;
    /**
     * mpeg4_width	Integer	Optional. Video width
     */
    @JsonProperty("mpeg4_width")
    private Integer mpeg4Width;
    /**
     * mpeg4_height	Integer	Optional. Video height
     */
    @JsonProperty("mpeg4_height")
    private Integer mpeg4Height;
    /**
     * mpeg4_duration	Integer	Optional. Video duration
     */
    @JsonProperty("mpeg4_duration")
    private Integer mpeg4Duration;
    /**
     * thumb_url	String	URL of the static thumbnail (jpeg or gif) for the result
     */
    @JsonProperty("thumb_url")
    private String thumbUrl;
    InlineQueryResultMpeg4Gif() {
        super(TYPE);
    }

    public String getMpeg4Url() {
        return mpeg4Url;
    }

    public void setMpeg4Url(String mpeg4Url) {
        this.mpeg4Url = mpeg4Url;
    }

    public Integer getMpeg4Width() {
        return mpeg4Width;
    }

    public void setMpeg4Width(Integer mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
    }

    public Integer getMpeg4Height() {
        return mpeg4Height;
    }

    public void setMpeg4Height(Integer mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
    }

    public Integer getMpeg4Duration() {
        return mpeg4Duration;
    }

    public void setMpeg4Duration(Integer mpeg4Duration) {
        this.mpeg4Duration = mpeg4Duration;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }
}
