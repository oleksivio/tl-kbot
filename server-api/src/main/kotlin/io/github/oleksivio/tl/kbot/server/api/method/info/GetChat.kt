package io.github.oleksivio.tl.kbot.server.api.method.info

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.ChatResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.Chat

/**
 * @see [getChat](https://core.telegram.org/bots/api/#getchat)
 */
data class GetChat(
    /**
     * chat_id Integer Yes Unique identifier for the target chat
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId
) : ChatAction<Chat>() {

    @JsonIgnore
    override val resultWrapperClass = ChatResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getChat"
}
