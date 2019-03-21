package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.IntegerResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [getChatMembersCount](https://core.telegram.org/bots/api/#getchatmemberscount)
 */
data class GetChatMembersCount(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        override val chatId: Long
) : ChatAction<Int>() {
    @JsonIgnore
    override val resultWrapperClass = IntegerResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChatMembersCount"
}
