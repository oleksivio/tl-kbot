package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.file;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#audio
 */
public class Audio {

    /**
     * file_id	String	Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * duration	Integer	Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * performer	String	Optional. Performer of the audio as defined by sender or by audio tags
     */
    @JsonProperty("performer")
    private String performer;
    /**
     * title	String	Optional. Title of the audio as defined by sender or by audio tags
     */
    @JsonProperty("title")
    private String title;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
