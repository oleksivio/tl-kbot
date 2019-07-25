package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.StringResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

/**
 * @see [exportChatInviteLink](https://core.telegram.org/bots/api/#exportchatinvitelink)
 */
class ExportChatInviteLink(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId
) : ChatAction<String>() {

    @JsonIgnore
    override val resultWrapperClass = StringResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "exportChatInviteLink"
}
