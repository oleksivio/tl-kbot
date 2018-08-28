package io.github.oleksivio.telegram.bot.api.model.objects.std.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
public class Animation implements ITelegram {
    /**
     * file_id String Unique file identifier
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * To setup filter:
     *
     * @see PhotoFilter thumb
     * thumb PhotoSize Optional. Animation thumbnail as defined by sender
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * To setup filter:
     *
     * @see StringFilter fileName
     * file_name String Optional. Original animation filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName = null;
    /**
     * To setup filter:
     *
     * @see StringFilter mimeType
     * mime_type String Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileSize
     * file_size Integer Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter width
     * width	Integer	Video width as defined by sender
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter height
     * height	Integer	Video height as defined by sender
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter duration
     * duration	Integer	Duration of the video in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;

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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
