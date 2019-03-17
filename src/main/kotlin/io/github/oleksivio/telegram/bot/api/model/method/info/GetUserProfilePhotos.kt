package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.UserProfilePhotos
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.UserProfilePhotosResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

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
         * offset Integer Optional Sequential number of the first photo to be returned. By default,
         * all photos are returned.
         */
        @JsonProperty(ApiDict.OFFSET_KEY)
        val offset: Int? = null,
        /**
         * limit Integer Optional Limits the number of photos to be retrieved. Values between 1—100
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
