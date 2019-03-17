package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.ChatResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [getChat](https://core.telegram.org/bots/api/#getchat)
 */
data class GetChat(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long
) : ChatAction<Chat>() {

    override val resultWrapperClass = ChatResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChat"

}
