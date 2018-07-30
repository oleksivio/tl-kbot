package ru.ioleksiv.telegram.bot.core.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultcachedvideo>InlineQueryResultCachedVideo</a>
 */
public class InlineQueryResultCachedVideo extends TitledInlineResult {
    private static final String TYPE ="video";

    /**
     * video_file_id	String	A valid file identifier for the video file
     */
    @JsonProperty("video_file_id")
    private String videoFileId;

    InlineQueryResultCachedVideo() {
        super(TYPE);
    }

    public String getVideoFileId() {
        return videoFileId;
    }

    public void setVideoFileId(String videoFileId) {
        this.videoFileId = videoFileId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * description	String	Optional. Short description of the result
     */
    @JsonProperty("description")
    private String description;

}
