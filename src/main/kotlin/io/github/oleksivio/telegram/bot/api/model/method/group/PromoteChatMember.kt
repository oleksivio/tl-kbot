package io.github.oleksivio.telegram.bot.api.model.method.group

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [promoteChatMember](https://core.telegram.org/bots/api.promotechatmember)
 */
class PromoteChatMember(actionNetworker: ActionNetworker) : ChatAction<Boolean>(METHOD, actionNetworker) {
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    var userId: Long? = null
    /**
     * can_change_info Boolean Optional Pass True, if the administrator can change chat title,
     * photo and other settings
     */
    @JsonProperty("can_change_info")
    var canChangeInfo: Boolean? = null
    /**
     * can_post_messages Boolean Optional Pass True, if the administrator can parse channel posts,
     * channels only
     */
    @JsonProperty("can_post_messages")
    var canPostMessages: Boolean? = null
    /**
     * can_edit_messages Boolean Optional Pass True, if the administrator can message messages of
     * other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    var canEditMessages: Boolean? = null
    /**
     * can_delete_messages Boolean Optional Pass True, if the administrator can delete messages
     * of other users
     */
    @JsonProperty("can_delete_messages")
    var canDeleteMessages: Boolean? = null
    /**
     * can_invite_users Boolean Optional Pass True, if the administrator can invite new users to
     * the chat
     */
    @JsonProperty("can_invite_users")
    var canInviteUsers: Boolean? = null
    /**
     * can_restrict_members Boolean Optional Pass True, if the administrator can restrict, ban or
     * unban chat members
     */
    @JsonProperty("can_restrict_members")
    var canRestrictMembers: Boolean? = null
    /**
     * can_pin_messages Boolean Optional Pass True, if the administrator can pin messages,
     * supergroups only
     */
    @JsonProperty("can_pin_messages")
    var canPinMessages: Boolean? = null
    /**
     * can_promote_members Boolean Optional Pass True, if the administrator can add new
     * administrators with a subset of his own privileges or demote administrators that he has
     * promoted, directly or indirectly (promoted by administrators that were appointed by him)
     */
    @JsonProperty("can_promote_members")
    var canPromoteMembers: Boolean? = null

    override val resultWrapperClass = BooleanResponse::class

    companion object {
        private const val METHOD = "promoteChatMember"
    }

}
