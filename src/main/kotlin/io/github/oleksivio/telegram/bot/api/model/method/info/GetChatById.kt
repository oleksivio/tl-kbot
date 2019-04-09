package io.github.oleksivio.telegram.bot.api.model.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.ChatResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [getChat](https://core.telegram.org/bots/api/#getchat)
 */
data class GetChatById(
        /**
         * chat_id Integer Yes Unique identifier for the target chat
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long
) : ChatAction<Chat>() {

    @JsonIgnore
    override val resultWrapperClass = ChatResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChat"

}
