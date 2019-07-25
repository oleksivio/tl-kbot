package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.IntegerResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

/**
 * @see [getChatMembersCount](https://core.telegram.org/bots/api/#getchatmemberscount)
 */
data class GetChatMembersCount(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    override val chatId: ChatId
) : ChatAction<Int>() {

    @JsonIgnore
    override val resultWrapperClass = IntegerResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChatMembersCount"
}
