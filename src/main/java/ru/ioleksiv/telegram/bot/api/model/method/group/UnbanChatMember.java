package ru.ioleksiv.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

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

    public UnbanChatMember(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Long getUserId() {
        return userId;
    }

    public UnbanChatMember setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {

        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public UnbanChatMember setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public UnbanChatMember setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
