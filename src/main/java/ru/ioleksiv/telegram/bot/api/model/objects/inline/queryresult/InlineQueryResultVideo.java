package ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultvideo>InlineQueryResultVideo</a>
 */
public class InlineQueryResultVideo extends TitledInlineResult {
    public static final String TYPE = "video";
    /**
     * video_url String A valid URL for the embedded video player or video file
     */
    @JsonProperty("video_url")
    private String videoUrl = null;
    /**
     * mime_type String Mime type of the content of video url, “text/html” or “video/mp4”
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * thumb_url String URL of the thumbnail (jpeg only) for the video
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;
    /**
     * video_width Integer Optional. Video width
     */
    @JsonProperty("video_width")
    private Integer videoWidth = null;
    /**
     * video_height Integer Optional. Video height
     */
    @JsonProperty("video_height")
    private Integer videoHeight = null;
    /**
     * video_duration Integer Optional. Video duration in seconds
     */
    @JsonProperty("video_duration")
    private Integer videoDuration = null;
    /**
     * description String Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description = null;

    InlineQueryResultVideo() {
        super(TYPE);
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    public Integer getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    public Integer getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
