package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://core.telegram.org/bots/api#voice
 */
public class Voice {
    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * duration	Integer	Duration of the audio in seconds as defined by sender
     */
    @JsonProperty("duration")
    private Integer duration;

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
}
