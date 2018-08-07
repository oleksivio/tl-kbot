package ru.ioleksiv.telegram.bot.api.model.method.group;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmemberscount">getChatMembersCount</a>
 */
public class GetChatMembersCount extends ChatAction<Integer> {
    private static final String METHOD = "getChatMembersCount";

    public GetChatMembersCount(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Integer>> getResultWrapperClass() {
        return ResponseCollection.IntegerResponse.class;
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
