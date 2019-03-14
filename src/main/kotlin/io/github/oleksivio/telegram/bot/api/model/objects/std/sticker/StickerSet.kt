package io.github.oleksivio.telegram.bot.api.model.objects.std.sticker

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import java.util.*

/**
 * @see [StickerSetResponse](https://core.telegram.org/bots/api.stickerset)
 */
data class StickerSet(
        /**
         * name String Sticker set name
         */
        @JsonProperty("name")
        var name: String? = null,
        /**
         * title String Sticker set title
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * contains_masks Boolean True, if the sticker set contains masks
         */
        @JsonProperty("contains_masks")
        var containsMasks: Boolean? = null,
        /**
         * stickers Array of Sticker List of all set stickers
         */
        @JsonProperty("stickers")
        var stickers: List<Sticker> = ArrayList()
) : ITelegram 
