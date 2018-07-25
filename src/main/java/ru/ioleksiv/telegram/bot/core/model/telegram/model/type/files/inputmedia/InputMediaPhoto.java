package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#inputmediaphoto
 */
public class InputMediaPhoto implements InputMedia {
    /**
     * type	String	Type of the result, must be photo
     */
    @JsonProperty("type")
    private String type;
    /**
     * media	String	File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet, or pass "attach://<file_attach_name>" to upload a new one using multipart/form-data under <file_attach_name> name. More info on Sending Files »
     */
    @JsonProperty("media")
    private String media;
    /**
     * caption	String	Optional. Caption of the photo to be sent, 0-200 characters
     */
    @JsonProperty("caption")
    private String caption;
    /**
     * parse_mode	String	Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String parseMode;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getMedia() {
        return media;
    }

    @Override
    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public String getCaption() {
        return caption;
    }

    @Override
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String getParseMode() {
        return parseMode;
    }

    @Override
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

}
