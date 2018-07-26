package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#video
 */
public class Video {
    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * duration	Integer	Duration of the video in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * width	Integer	Video width as defined by sender
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * height	Integer	Video height as defined by sender
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * thumb	PhotoSize	Optional. Video thumbnail
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * mime_type	String	Optional. MIME type of the files as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;
    /**
     * file_size	Integer	Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
