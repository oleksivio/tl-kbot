package io.github.oleksivio.telegram.bot.api.model.objects.std.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#stickerset>StickerSetResponse</a>
 */
public class StickerSet implements ITelegram {
    /**
     * name String Sticker set name
     */
    @JsonProperty("name")
    private String name = null;
    /**
     * title String Sticker set title
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * contains_masks Boolean True, if the sticker set contains masks
     */
    @JsonProperty("contains_masks")
    private Boolean containsMasks = null;
    /**
     * stickers Array of Sticker List of all set stickers
     */
    @JsonProperty("stickers")
    private List<Sticker> stickers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getContainsMasks() {
        return containsMasks;
    }

    public void setContainsMasks(Boolean containsMasks) {
        this.containsMasks = containsMasks;
    }

    public List<Sticker> getStickers() {
        return stickers;
    }

    public void setStickers(List<Sticker> stickers) {
        this.stickers = stickers;
    }
}
