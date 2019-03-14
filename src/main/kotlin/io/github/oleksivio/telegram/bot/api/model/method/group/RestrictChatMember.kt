package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [restrictChatMember](https://core.telegram.org/bots/api.restrictchatmember)
 */
class RestrictChatMember(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * until_date Integer Optional Date when the user will be unbanned, unix time. If user is
     * banned for more than 366 days or less than 30 seconds from the current time they are
     * considered to be banned forever
     */
    @JsonProperty("until_date")
    var untilDate: Long? = null
    /**
     * can_send_messages Boolean Optional Pass True, if the user can send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    var canSendMessages: Boolean? = null
    /**
     * can_send_media_messages Boolean Optional Pass True, if the user can send audios, documents, photos, videos,
     * video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    var canSendMediaMessages: Boolean? = null
    /**
     * can_send_other_messages Boolean Optional Pass True, if the user can send animations, games, stickers and use
     * inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    var canSendOtherMessages: Boolean? = null
    /**
     * can_add_web_page_previews Boolean Optional Pass True, if the user may add web page previews to their messages,
     * implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    var canAddWebPagePreviews: Boolean? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "restrictChatMember"
    }

}
