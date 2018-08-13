package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#video">Video</a>
 */
public class Video implements ITelegram {
    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * duration Integer Duration of the video in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * width Integer Video width as defined by sender
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height Integer Video height as defined by sender
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * thumb PhotoSize Optional. Video thumbnail
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * mime_type String Optional. MIME type of the files as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * file_size Integer Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;

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
