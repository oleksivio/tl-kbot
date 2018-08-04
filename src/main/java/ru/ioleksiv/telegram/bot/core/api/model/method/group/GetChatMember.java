package ru.ioleksiv.telegram.bot.core.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.ChatMember;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmember">getChatMember</a>
 */
public class GetChatMember extends ChatAction<ChatMember> {
    private static final String METHOD = "getChatMember";

    /**
     * user_id	Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;

    public GetChatMember(Networker networker) {
        super(METHOD, networker);
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
        return ResponseCollection.ChatMemberResponse.class;
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