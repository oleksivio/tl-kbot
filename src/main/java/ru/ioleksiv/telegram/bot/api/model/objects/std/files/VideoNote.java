package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#videonote">VideoNote</a>
 */
public class VideoNote implements ITelegram {
    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter length
     * length Integer Video width and height as defined by sender
     */
    @JsonProperty("length")
    private Integer length = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter duration
     * duration Integer Duration of the video in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * To setup filter:
     *
     * @see PhotoFilter thumb
     * thumb PhotoSize Optional. Video thumbnail
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileSize
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
