package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.UserProfilePhotos
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.UserProfilePhotosResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getUserProfilePhotos](https://core.telegram.org/bots/api.getuserprofilephotos)
 */
class GetUserProfilePhotos(actionNetworker: ActionNetworker) : RunnableAction<UserProfilePhotos>(METHOD, actionNetworker) {
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * offset Integer Optional Sequential number of the first photo to be returned. By default,
     * all photos are returned.
     */
    @JsonProperty("offset")
    var offset: Int? = null
    /**
     * limit Integer Optional Limits the number of photos to be retrieved. Values between 1—100
     * are accepted. Defaults to 100.
     */
    @JsonProperty("limit")
    var limit: Int? = null

    override val resultWrapperClass = UserProfilePhotosResponse::class

    companion object {
        private const val METHOD = "getUserProfilePhotos"
    }

}
