package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.PhotoSize;

/**
 * @link https://core.telegram.org/bots/api#sticker
 */
public class Sticker {
    private static final Logger LOG = LoggerFactory.getLogger(Sticker.class);
    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId;
    /**
     * width	Integer	Sticker width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * height	Integer	Sticker height
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * thumb	PhotoSize	Optional. Sticker thumbnail in the .webp or .jpg format
     */
    @JsonProperty("thumb")
    private PhotoSize thumb;
    /**
     * emoji String	Optional. Emoji associated with the sticker
     */
    @JsonProperty("emoji")
    private String emoji;
    /**
     * set_name	String	Optional. Name of the sticker set to which the sticker belongs
     */
    @JsonProperty("set_name")
    private String setName;
    /**
     * mask_position	MaskPosition	Optional. For mask stickers, the position where the mask should be placed
     */
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

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
