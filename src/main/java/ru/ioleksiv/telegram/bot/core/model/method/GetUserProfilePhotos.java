package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.files.UserProfilePhotos;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getuserprofilephotos">getUserProfilePhotos</a>
 */
public class GetUserProfilePhotos extends RunnableAction<UserProfilePhotos> {
    private static final String METHOD = "getUserProfilePhotos";
    /**
     * user_id	Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * offset	Integer	Optional	Sequential number of the first photo to be returned. By default,
     * all photos are returned.
     */
    @JsonProperty("offset")
    private Integer offset = null;
    /**
     * limit	Integer	Optional	Limits the number of photos to be retrieved. Values between 1—100
     * are accepted. Defaults to 100.
     */
    @JsonProperty("limit")
    private Integer limit = null;

    public GetUserProfilePhotos(Networker networker) {
        super(METHOD, networker);
    }

    public Long getUserId() {
        return userId;
    }

    public GetUserProfilePhotos setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public GetUserProfilePhotos setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public GetUserProfilePhotos setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<UserProfilePhotos>> getResultWrapperClass() {
        return ResponseCollection.UserProfilePhotosResponse.class;
    }
}
