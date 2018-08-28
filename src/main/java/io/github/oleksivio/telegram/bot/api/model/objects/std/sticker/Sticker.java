package io.github.oleksivio.telegram.bot.api.model.objects.std.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MaskPositionFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#sticker">Sticker</a>
 */
public class Sticker implements ITelegram {
    /**
     * To setup filter:
     *
     * @see MaskPositionFilter maskPosition
     * mask_position MaskPosition Optional. For mask stickers, the position where the mask should be placed
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition = null;
    /**
     * file_id String Unique identifier for this files
     */
    @JsonProperty("file_id")
    private String fileId = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter width
     * width Integer Sticker width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter height
     * height Integer Sticker height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * To setup filter:
     *
     * @see PhotoFilter thumb
     * thumb PhotoSize Optional. Sticker thumbnail in the .webp or .jpg format
     */
    @JsonProperty("thumb")
    private PhotoSize thumb = null;
    /**
     * To setup filter:
     *
     * @see StringFilter emoji
     * emoji String Optional. Emoji associated with the sticker
     */
    @JsonProperty("emoji")
    private String emoji = null;
    /**
     * To setup filter:
     *
     * @see StringFilter setName
     * set_name String Optional. Name of the sticker set to which the sticker belongs
     */
    @JsonProperty("set_name")
    private String setName = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter fileSize
     * file_size Integer Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize = null;

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public void setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
    }

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
