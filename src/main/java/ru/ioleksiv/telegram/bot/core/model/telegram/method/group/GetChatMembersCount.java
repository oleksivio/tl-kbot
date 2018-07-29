package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatmemberscount">getChatMembersCount</a>
 */
public class GetChatMembersCount extends ChatAction<Integer> {
    private static final String METHOD = "getChatMembersCount";

    protected GetChatMembersCount(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Integer>> getResultWrapperClass() {
        return ResponseCollection.IntegerResponse.class;
    }

    @Override
    public GetChatMembersCount setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
