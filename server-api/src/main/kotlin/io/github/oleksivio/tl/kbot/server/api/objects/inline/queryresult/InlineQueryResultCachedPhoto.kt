package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultCachedPhoto](https://core.telegram.org/bots/api/#inlinequeryresultcachedphoto)
 */
class InlineQueryResultCachedPhoto(
    /**
     * photo_file_id String A valid file identifier of the photo
     */
    @JsonProperty("photo_file_id")
    var photoFileId: String,
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
