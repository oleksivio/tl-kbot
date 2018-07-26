package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#document
 */
public class Document {

    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * thumb	PhotoSize	Optional. Document thumbnail as defined by sender
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * emoji String	Optional. Emoji associated with the sticker
     */
    @JsonProperty("emoji")
    private String emoji;
    /**
     * file_name	String	Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;
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
