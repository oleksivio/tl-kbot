package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files.PhotoSize;

/**
 * @link https://core.telegram.org/bots/api#animation
 */
public class Animation {
    /**
     * file_id	String	Unique file identifier
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * thumb	PhotoSize	Optional. Animation thumbnail as defined by sender
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * file_name	String	Optional. Original animation filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;
    /**
     * mime_type	String	Optional. MIME type of the file as defined by sender
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
