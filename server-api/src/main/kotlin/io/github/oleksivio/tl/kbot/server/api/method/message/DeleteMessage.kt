package io.github.oleksivio.tl.kbot.server.api.method.message

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

/**
 * @see [deleteMessage](https://core.telegram.org/bots/api/#deletemessage)
 */
data class DeleteMessage(
        /**
         * message_id Integer Yes Identifier of the message to delete
         */
        @JsonProperty(ApiDict.MESSAGE_ID_KEY)
        val messageId: Long,
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel (in the format @channelusername)
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: ChatId
) : ChatAction<Boolean>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method: String = "deleteMessage"

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class
}
