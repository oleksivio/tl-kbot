package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#userprofilephotos">UserProfilePhotos</a>
 */
public class UserProfilePhotos {
    /**
     * total_count	Integer	Total number of profile pictures the target user has
     */
    @JsonProperty("total_count")
    private Integer totalCount;
    /**
     * photos	Array of Array of PhotoSize	Requested profile pictures (in up to 4 sizes each)
     */
    @JsonProperty("photos")
    private List<PhotoSize> photos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PhotoSize> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoSize> photos) {
        this.photos = photos;
    }
}
