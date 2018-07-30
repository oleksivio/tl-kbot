package ru.ioleksiv.telegram.bot.core.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.ChatMember;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

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

    protected GetChatMember(Networker networker) {
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
    public Class<? extends CommonResponse<ChatMember>> getResultWrapperClass() {
        return ResponseCollection.ChatMemberResponse.class;
    }

    @Override
    public GetChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
