package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.common.ChatAction

/**
 * @see [restrictChatMember](https://core.telegram.org/bots/api/#restrictchatmember)
 */
data class RestrictChatMember(
        /**
         * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
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
        val untilDate: Long? = null,
        /**
         * can_send_messages Boolean Optional Pass True, if the user can send text messages, contacts, locations and venues
         */
        @JsonProperty(ApiDict.CAN_SEND_MESSAGES_KEY)
        val canSendMessages: Boolean? = null,
        /**
         * can_send_media_messages Boolean Optional Pass True, if the user can send audios, documents, photos, videos,
         * video notes and voice notes, implies can_send_messages
         */
        @JsonProperty(ApiDict.CAN_SEND_MEDIA_MESSAGES_KEY)
        val canSendMediaMessages: Boolean? = null,
        /**
         * can_send_other_messages Boolean Optional Pass True, if the user can send animations, games, stickers and use
         * inline bots, implies can_send_media_messages
         */
        @JsonProperty(ApiDict.CAN_SEND_OTHER_MESSAGES_KEY)
        val canSendOtherMessages: Boolean? = null,
        /**
         * can_add_web_page_previews Boolean Optional Pass True, if the user may add web page previews to their messages,
         * implies can_send_media_messages
         */
        @JsonProperty(ApiDict.CAN_ADD_WEB_PAGE_PREVIEWS_KEY)
        val canAddWebPagePreviews: Boolean? = null

) : ChatAction<Boolean>() {
    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "restrictChatMember"

}
