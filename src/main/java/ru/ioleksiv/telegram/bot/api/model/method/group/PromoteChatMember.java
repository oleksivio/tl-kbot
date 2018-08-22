package ru.ioleksiv.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#promotechatmember">promoteChatMember</a>
 */
public class PromoteChatMember extends ChatAction<Boolean> {
    private static final String METHOD = "promoteChatMember";
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * can_change_info Boolean Optional Pass True, if the administrator can change chat title,
     * photo and other settings
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo = null;
    /**
     * can_post_messages Boolean Optional Pass True, if the administrator can parse channel posts,
     * channels only
     */
    @JsonProperty("can_post_messages")
    private Boolean canPostMessages = null;
    /**
     * can_edit_messages Boolean Optional Pass True, if the administrator can message messages of
     * other users and can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages = null;
    /**
     * can_delete_messages Boolean Optional Pass True, if the administrator can delete messages
     * of other users
     */
    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages = null;
    /**
     * can_invite_users Boolean Optional Pass True, if the administrator can invite new users to
     * the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers = null;
    /**
     * can_restrict_members Boolean Optional Pass True, if the administrator can restrict, ban or
     * unban chat members
     */
    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers = null;
    /**
     * can_pin_messages Boolean Optional Pass True, if the administrator can pin messages,
     * supergroups only
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages = null;
    /**
     * can_promote_members Boolean Optional Pass True, if the administrator can add new
     * administrators with a subset of his own privileges or demote administrators that he has
     * promoted, directly or indirectly (promoted by administrators that were appointed by him)
     */
    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers = null;

    public PromoteChatMember(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    public Long getUserId() {
        return userId;
    }

    public PromoteChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public PromoteChatMember setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public PromoteChatMember setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
        return this;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public PromoteChatMember setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
        return this;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public PromoteChatMember setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
        return this;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public PromoteChatMember setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public PromoteChatMember setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
        return this;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public PromoteChatMember setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public PromoteChatMember setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
        return this;
    }

    @Override
    public PromoteChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public PromoteChatMember setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
