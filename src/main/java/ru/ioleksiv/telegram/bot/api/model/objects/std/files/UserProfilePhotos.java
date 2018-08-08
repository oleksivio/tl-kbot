package ru.ioleksiv.telegram.bot.api.model.objects.std.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">UserProfilePhotos</a>
 */
public class UserProfilePhotos implements ITelegram {
    /**
     * photos	Array of Array of PhotoSize	Requested profile pictures (in up to 4 sizes each)
     */
    @JsonProperty("photos")
    private final List<List<PhotoSize>> photos = new ArrayList<>();
    /**
     * total_count	Integer	Total number of profile pictures the target user has
     */
    @JsonProperty("total_count")
    private Integer totalCount = null;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos.addAll(photos);
    }

}
