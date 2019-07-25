package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId

/**
 * @see [promoteChatMember](https://core.telegram.org/bots/api/#promotechatmember)
 */
data class PromoteChatMember(
    /**
     * chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty(ApiDict.USER_ID_KEY)
    val userId: Long,
    /**
     * can_change_info [Boolean] OptionalPass True, if the administrator can change chat title,
     * photo and other settings
     */
    @JsonProperty("can_change_info")
    val canChangeInfo: Boolean? = null,
    /**
     * can_post_messages [Boolean] OptionalPass True, if the administrator can parse channel posts,
     * channels only
     */
    @JsonProperty("can_post_messages")
    val canPostMessages: Boolean? = null,
    /**
     * can_edit_messages [Boolean] OptionalPass True, if the administrator can message messages of
     * other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    val canEditMessages: Boolean? = null,
    /**
     * can_delete_messages [Boolean] OptionalPass True, if the administrator can delete messages
     * of other users
     */
    @JsonProperty("can_delete_messages")
    val canDeleteMessages: Boolean? = null,
    /**
     * can_invite_users [Boolean] OptionalPass True, if the administrator can invite new users to
     * the chat
     */
    @JsonProperty("can_invite_users")
    val canInviteUsers: Boolean? = null,
    /**
     * can_restrict_members [Boolean] OptionalPass True, if the administrator can restrict, ban or
     * unban chat members
     */
    @JsonProperty("can_restrict_members")
    val canRestrictMembers: Boolean? = null,
    /**
     * can_pin_messages [Boolean] OptionalPass True, if the administrator can pin messages,
     * supergroups only
     */
    @JsonProperty("can_pin_messages")
    val canPinMessages: Boolean? = null,
    /**
     * can_promote_members [Boolean] OptionalPass True, if the administrator can add new
     * administrators with a subset of his own privileges or demote administrators that he has
     * promoted, directly or indirectly (promoted by administrators that were appointed by him)
     */
    @JsonProperty("can_promote_members")
    val canPromoteMembers: Boolean? = null
) : ChatAction<Boolean>() {

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "promoteChatMember"
}
