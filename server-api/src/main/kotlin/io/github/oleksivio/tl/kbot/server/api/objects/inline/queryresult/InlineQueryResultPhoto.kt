package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultPhoto](https://core.telegram.org/bots/api/#inlinequeryresultphoto)
 */
class InlineQueryResultPhoto(
    /**
     * photo_url String A valid URL of the photo. Photo must be in jpeg format.
     * Photo size must not exceed 5MB
     */
    @JsonProperty("photoUrl;")
    var photoUrl: String,
    /**
     * thumb_url String URL of the thumbnail for the photo
     */
    @JsonProperty("thumb_url")
    var thumbUrl: String,
    /**
     * photo_width Integer Optional. Width of the photo
     */
    @JsonProperty("photo_width")
    var photoWidth: Int? = null,
    /**
     * photo_height Integer Optional. Height of the photo
     */
    @JsonProperty("photo_height")
    var photoHeight: Int? = null,
    /**
     * description [String] Optional. Short description of the result
     */
    @JsonProperty("description")
    var description: String? = null,
    /**
     * type String Type of the result
     */
    @JsonProperty("type")
    val type: String = "photo"
) : TitledInlineResult()
