package io.github.oleksivio.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#restrictchatmember">restrictChatMember</a>
 */
public class RestrictChatMember extends ChatAction<Boolean> {
    private static final String METHOD = "restrictChatMember";
    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * until_date Integer Optional Date when the user will be unbanned, unix time. If user is
     * banned for more than 366 days or less than 30 seconds from the current time they are
     * considered to be banned forever
     */
    @JsonProperty("until_date")
    private Long untilDate = null;
    /**
     * can_send_messages Boolean Optional Pass True, if the user can send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages = null;
    /**
     * can_send_media_messages Boolean Optional Pass True, if the user can send audios, documents, photos, videos,
     * video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages = null;
    /**
     * can_send_other_messages Boolean Optional Pass True, if the user can send animations, games, stickers and use
     * inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages = null;
    /**
     * can_add_web_page_previews Boolean Optional Pass True, if the user may add web page previews to their messages,
     * implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews = null;

    public RestrictChatMember(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Long getUserId() {
        return userId;
    }

    public RestrictChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getUntilDate() {
        return untilDate;
    }

    public RestrictChatMember setUntilDate(Long untilDate) {
        this.untilDate = untilDate;
        return this;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public RestrictChatMember setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
        return this;
    }

    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    public RestrictChatMember setCanSendMediaMessages(Boolean canSendMediaMessages) {
        this.canSendMediaMessages = canSendMediaMessages;
        return this;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public RestrictChatMember setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
        return this;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public RestrictChatMember setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    @Override
    public RestrictChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public RestrictChatMember setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
