package io.github.oleksivio.tl.kbot.server.api.method.sticker

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.StickerSetResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.StickerSet

/**
 * @see [getStickerSet](https://core.telegram.org/bots/api/#getstickerset)
 */
data class GetStickerSet(
    /**
     * name String Yes Name of the sticker set
     */
    @JsonProperty(ApiDict.NAME_KEY)
    val name: String
) : Action<StickerSet>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getStickerSet"

    @JsonIgnore
    override val resultWrapperClass = StickerSetResponse::class
}
