package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [setChatStickerSet](https://core.telegram.org/bots/api/#setchatstickerset)
 */
data class SetChatStickerSet(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
        /**
         * sticker_set_name String Name of the sticker set to be set as the group sticker set
         */
        @JsonProperty(ApiDict.STICKER_SET_NAME_KEY)
        val stickerSetName: String
) : ChatAction<Boolean>() {

    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setChatStickerSet"

}
