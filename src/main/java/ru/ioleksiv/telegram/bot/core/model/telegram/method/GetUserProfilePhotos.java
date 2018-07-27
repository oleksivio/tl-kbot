package ru.ioleksiv.telegram.bot.core.model.telegram.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.files.UserProfilePhotos;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getuserprofilephotos">getUserProfilePhotos</a>
 */
public class GetUserProfilePhotos extends RunnableAction<UserProfilePhotos> {
    private static final String METHOD = "getUserProfilePhotos";

    /**
     * user_id	Integer	Yes	Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;
    /**
     * offset	Integer	Optional	Sequential number of the first photo to be returned. By default,
     * all photos are returned.
     */
    @JsonProperty("offset")
    private Integer offset;
    /**
     * limit	Integer	Optional	Limits the number of photos to be retrieved. Values between 1—100
     * are accepted. Defaults to 100.
     */
    @JsonProperty("limit")
    private Integer limit;

    public GetUserProfilePhotos(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<UserProfilePhotos>> getResultWrapperClass() {
        return ResponseCollection.UserProfilePhotosResponse.class;
    }
}
