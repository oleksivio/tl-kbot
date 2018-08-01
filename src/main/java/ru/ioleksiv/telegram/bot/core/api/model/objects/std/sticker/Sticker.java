package ru.ioleksiv.telegram.bot.core.api.model.objects.std.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.files.PhotoSize;

/**
 * @see <a href="https://core.telegram.org/bots/api#sticker">Sticker</a>
 */
public class Sticker {
    private static final Logger LOG = LoggerFactory.getLogger(Sticker.class);
    /**
     * file_id	String	Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * width	Integer	Sticker width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height	Integer	Sticker height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * thumb	PhotoSize	Optional. Sticker thumbnail in the .webp or .jpg format
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * emoji String	Optional. Emoji associated with the sticker
     */
    @JsonProperty("emoji")
    private String emoji = null;
    /**
     * set_name	String	Optional. Name of the sticker set to which the sticker belongs
     */
    @JsonProperty("set_name")
    private String setName = null;
    /**
     * mask_position	MaskPosition	Optional. For mask stickers, the position where the mask should be placed
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition = null;
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
