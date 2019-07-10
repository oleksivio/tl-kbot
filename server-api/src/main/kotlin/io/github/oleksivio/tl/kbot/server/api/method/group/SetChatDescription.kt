package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

/**
 * @see [setChatDescription](https://core.telegram.org/bots/api/#setchatdescription)
 */
data class SetChatDescription(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * description [String] Optional New chat description, 0-255 characters
     */
    @JsonProperty(ApiDict.DESCRIPTION_KEY)
    val description: String? = null
) : ChatAction<Boolean>() {

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setChatDescription"
}

