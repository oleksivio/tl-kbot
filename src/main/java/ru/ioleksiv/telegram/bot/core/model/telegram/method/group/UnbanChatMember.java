package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#unbanchatmember">unbanChatMember</a>
 */
public class UnbanChatMember extends ChatAction<Boolean> {
    private static final String METHOD = "unbanChatMember";
    /**
     * user_id	Integer Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId = null;

    public UnbanChatMember(Networker networker) {
        super(METHOD, networker);
    }

    public Long getUserId() {
        return userId;
    }

    public UnbanChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {

        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public UnbanChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

}
