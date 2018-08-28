package io.github.oleksivio.telegram.bot.api.model.method.group;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.IntegerResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmemberscount">getChatMembersCount</a>
 */
public class GetChatMembersCount extends ChatAction<Integer> {
    private static final String METHOD = "getChatMembersCount";

    public GetChatMembersCount(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Integer>> getResultWrapperClass() {
        return IntegerResponse.class;
    }

    @Override
    public GetChatMembersCount setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public GetChatMembersCount setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
