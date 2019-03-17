package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.ChatMembersResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [getChatAdministrators](https://core.telegram.org/bots/api/#getchatadministrators)
 */
data class GetChatAdministrators(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long
) : ChatAction<List<ChatMember>>() {
    @JsonIgnore
    override val resultWrapperClass = ChatMembersResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChatAdministrators"
}
