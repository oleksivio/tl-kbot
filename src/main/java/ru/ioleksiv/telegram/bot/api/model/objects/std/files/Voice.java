package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#voice">Voice</a>
 */
public class Voice implements ITelegram {
    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * duration Integer Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration = null;
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
