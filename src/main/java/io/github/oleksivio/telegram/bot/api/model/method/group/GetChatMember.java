package io.github.oleksivio.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.ChatMemberResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmember">getChatMember</a>
 */
public class GetChatMember extends ChatAction<ChatMember> {
    private static final String METHOD = "getChatMember";

    /**
     * user_id Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;

    public GetChatMember(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Long getUserId() {
        return userId;
    }

    public GetChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<ChatMember>> getResultWrapperClass() {
        return ChatMemberResponse.class;
    }

    @Override
    public GetChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public GetChatMember setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
