package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @link https://core.telegram.org/bots/api#chatmember
 */
public class ChatMember {
    /**
     * user	User	Information about the user
     */
    @JsonProperty("user")
    private User user;
    /**
     * status	String	The member's status in the chat. Can be “creator”, “administrator”, “member”,
     * “restricted”, “left” or “kicked”
     */
    @JsonProperty("status")
    private String status;
    /**
     * until_date	Integer	Optional. Restricted and kicked only. Date when restrictions will be
     * lifted for this user, unix time
     */
    @JsonProperty("until_date")
    private Long untilDate;
    /**
     * can_be_edited	Boolean	Optional. Administrators only. True, if the bot is allowed to edit
     * administrator privileges of that user
     */
    @JsonProperty("can_be_edited")
    private Boolean canBeEdited;
    /**
     * can_change_info	Boolean	Optional. Administrators only. True, if the administrator can change
     * the chat title, photo and other settings
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;
    /**
     * can_post_messages	Boolean	Optional. Administrators only. True, if the administrator can post
     * in the channel, channels only
     */
    @JsonProperty("can_post_messages")
    private Boolean canPostMessages;
    /**
     * can_edit_messages	Boolean	Optional. Administrators only. True, if the administrator can edit
     * messages of other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;
    /**
     * can_delete_messages	Boolean	Optional. Administrators only. True, if the administrator can
     * delete messages of other users
     */
    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages;
    /**
     * can_invite_users	Boolean	Optional. Administrators only. True, if the administrator can invite
     * new users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;
    /**
     * can_restrict_members	Boolean	Optional. Administrators only. True, if the administrator can
     * restrict, ban or unban chat members
     */
    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers;
    /**
     * can_pin_messages	Boolean	Optional. Administrators only. True, if the administrator can pin
     * messages, supergroups only
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;
    /**
     * can_promote_members	Boolean	Optional. Administrators only. True, if the administrator can add
     * new administrators with a subset of his own privileges or demote administrators that he has
     * promoted, directly or indirectly (promoted by administrators that were appointed by the user)
     */
    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers;
    /**
     * can_send_messages	Boolean	Optional. Restricted only. True, if the user can send text
     * messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;
    /**
     * can_send_media_messages	Boolean	Optional. Restricted only. True, if the user can send audios,
     * documents, photos, videos, video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages;
    /**
     * can_send_other_messages	Boolean	Optional. Restricted only. True, if the user can send
     * animations, games, stickers and use inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages;
    /**
     * can_add_web_page_previews	Boolean	Optional. Restricted only. True, if user may add web
     * page previews to his messages, implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public void setUntilDate(Long untilDate) {
        this.untilDate = untilDate;
    }

    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    public void setCanBeEdited(Boolean canBeEdited) {
        this.canBeEdited = canBeEdited;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public void setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public void setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public void setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public void setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public void setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public void setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
    }

    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    public void setCanSendMediaMessages(Boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public void setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public void setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
    }
}
