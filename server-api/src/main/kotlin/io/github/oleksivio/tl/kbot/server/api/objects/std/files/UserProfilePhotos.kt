package io.github.oleksivio.tl.kbot.server.api.objects.std.files

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [UserProfilePhotos](https://core.telegram.org/bots/api/#userprofilephotos)
 */
data class UserProfilePhotos(
    /**
         * photos Array of Array of PhotoSize Requested profile pictures (in up to 4 sizes each)
         */
        @JsonProperty("photos")
        val photos: List<List<PhotoSize>>? = null,
    /**
         * total_count Integer Total number of profile pictures the target user has
         */
        @JsonProperty("total_count")
        var totalCount: Int? = null

) : ITelegram
