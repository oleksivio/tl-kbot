package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.ChatMember;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmember>getChatMember</a>
 */
public class GetChatMember  extends ChatAction<ChatMember > {
    private static final String METHOD = "getChatMember";

    /**
     *user_id	Integer	Yes	Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;

    protected GetChatMember(Networker networker) {
        super(METHOD, networker);
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public Class<? extends CommonResponse<ChatMember>> getResultWrapperClass() {
        return ResponseCollection.ChatMemberResponse.class;
    }

    public GetChatMember  setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
