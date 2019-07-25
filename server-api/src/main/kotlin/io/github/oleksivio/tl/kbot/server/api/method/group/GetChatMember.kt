package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.ChatMemberResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.ChatMember

/**
 * @see [getChatMember](https://core.telegram.org/bots/api/#getchatmember)
 */
data class GetChatMember(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty(ApiDict.USER_ID_KEY)
    val userId: Long
) : ChatAction<ChatMember>() {

    @JsonIgnore
    override val resultWrapperClass = ChatMemberResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChatMember"
}
