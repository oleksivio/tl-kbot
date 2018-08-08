package ru.ioleksiv.telegram.bot.api.model.objects.std.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
public class Animation implements ITelegram {
    /**
     * file_id	String	Unique file identifier
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * thumb	PhotoSize	Optional. Animation thumbnail as defined by sender
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * file_name	String	Optional. Original animation filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName = null;
    /**
     * mime_type	String	Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType = null;
    /**
     * file_size	Integer	Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;

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
