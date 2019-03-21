package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [kickChatMember](https://core.telegram.org/bots/api/#kickchatmember)
 */
data class KickChatMember(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        override val chatId: Long,
        /**
         * user_id Integer Unique identifier of the target user
         */
        @JsonProperty(ApiDict.USER_ID_KEY)
        val userId: Long,
        /**
         * until_date Integer Optional Date when the user will be unbanned, unix time. If user is
         * banned for more than 366 days or less than 30 seconds from the current time they are
         * considered to be banned forever
         */
        @JsonProperty(ApiDict.UNTIL_DATE_KEY)
        val untilDate: Long? = null
) : ChatAction<Boolean>() {

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "kickChatMember"

}
