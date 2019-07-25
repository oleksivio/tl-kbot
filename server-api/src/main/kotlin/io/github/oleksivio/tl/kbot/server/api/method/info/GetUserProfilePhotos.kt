package io.github.oleksivio.tl.kbot.server.api.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.UserProfilePhotosResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.UserProfilePhotos

/**
 * @see [getUserProfilePhotos](https://core.telegram.org/bots/api/#getuserprofilephotos)
 */
data class GetUserProfilePhotos(
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty(ApiDict.USER_ID_KEY)
    val userId: Long,
    /**
     * offset [Integer] OptionalSequential number of the first photo to be returned. By default,
     * all photos are returned.
     */
    @JsonProperty(ApiDict.OFFSET_KEY)
    val offset: Int? = null,
    /**
     * limit [Integer] OptionalLimits the number of photos to be retrieved. Values between 1—100
     * are accepted. Defaults to 100.
     */
    @JsonProperty(ApiDict.LIMIT_KEY)
    val limit: Int? = null
) : Action<UserProfilePhotos>() {

    @JsonIgnore
    override val resultWrapperClass = UserProfilePhotosResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getUserProfilePhotos"
}
