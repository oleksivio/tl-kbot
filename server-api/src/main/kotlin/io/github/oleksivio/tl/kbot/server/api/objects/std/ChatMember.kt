package io.github.oleksivio.tl.kbot.server.api.objects.std

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

/**
 *  [ChatMember](https://core.telegram.org/bots/api/#chatmember)
 */
data class ChatMember(
    /**
         * user User Information about the user
         */
        @JsonProperty("user")
        var user: User? = null,
    /**
         * status String The member's status in the chat. Can be “creator”, “administrator”, “member”, “restricted”, “left” or
         * “kicked”
         */
        @JsonProperty("status")
        var status: String? = null,
    /**
         * until_date Integer Optional. Restricted and kicked only. Date when restrictions will be lifted for this user, unix
         * time
         */
        @JsonProperty("until_date")
        var untilDate: Long? = null,
    /**
         * can_be_edited Boolean Optional. Administrators only. True, if the bot is allowed to message administrator
         * privileges of that user
         */
        @JsonProperty("can_be_edited")
        var canBeEdited: Boolean? = null,
    /**
         * can_change_info Boolean Optional. Administrators only. True, if the administrator can change the chat title, photo
         * and other settings
         */
        @JsonProperty("can_change_info")
        var canChangeInfo: Boolean? = null,
    /**
         * can_post_messages Boolean Optional. Administrators only. True, if the administrator can post in the channel,
         * channels only
         */
        @JsonProperty("can_post_messages")
        var canPostMessages: Boolean? = null,
    /**
         * can_edit_messages Boolean Optional. Administrators only. True, if the administrator can message messages of other
         * users and can pin messages, channels only
         */
        @JsonProperty("can_edit_messages")
        var canEditMessages: Boolean? = null,
    /**
         * can_delete_messages Boolean Optional. Administrators only. True, if the administrator can delete messages of other
         * users
         */
        @JsonProperty("can_delete_messages")
        var canDeleteMessages: Boolean? = null,
    /**
         * can_invite_users Boolean Optional. Administrators only. True, if the administrator can invite new users to the
         * chat
         */
        @JsonProperty("can_invite_users")
        var canInviteUsers: Boolean? = null,
    /**
         * can_restrict_members Boolean Optional. Administrators only. True, if the administrator can restrict, ban or unban
         * chat members
         */
        @JsonProperty("can_restrict_members")
        var canRestrictMembers: Boolean? = null,
    /**
         * can_pin_messages Boolean Optional. Administrators only. True, if the administrator can pin messages, supergroups
         * only
         */
        @JsonProperty("can_pin_messages")
        var canPinMessages: Boolean? = null,
    /**
         * can_promote_members Boolean Optional. Administrators only. True, if the administrator can add new administrators
         * with a subset of his own privileges or demote administrators that he has promoted, directly or indirectly (promoted
         * by administrators that were appointed by the user)
         */
        @JsonProperty("can_promote_members")
        var canPromoteMembers: Boolean? = null,
    /**
         * can_send_messages Boolean Optional. Restricted only. True, if the user can send text messages, contacts, locations
         * and venues
         */
        @JsonProperty("can_send_messages")
        var canSendMessages: Boolean? = null,
    /**
         * can_send_media_messages Boolean Optional. Restricted only. True, if the user can send audios, documents, photos,
         * videos, video notes and voice notes, implies can_send_messages
         */
        @JsonProperty("can_send_media_messages")
        var canSendMediaMessages: Boolean? = null,
    /**
         * can_send_other_messages Boolean Optional. Restricted only. True, if the user can send animations, games, stickers
         * and use inline bots, implies can_send_media_messages
         */
        @JsonProperty("can_send_other_messages")
        var canSendOtherMessages: Boolean? = null,
    /**
         * can_add_web_page_previews Boolean Optional. Restricted only. True, if user may add web page previews to his
         * messages, implies can_send_media_messages
         */
        @JsonProperty("can_add_web_page_previews")
        var canAddWebPagePreviews: Boolean? = null
) : ITelegram
