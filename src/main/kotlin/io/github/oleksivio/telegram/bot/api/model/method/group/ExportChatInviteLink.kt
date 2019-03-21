package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.StringResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [exportChatInviteLink](https://core.telegram.org/bots/api/#exportchatinvitelink)
 */
class ExportChatInviteLink(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long
) : ChatAction<String>() {

    override val resultWrapperClass = StringResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "exportChatInviteLink"

}
