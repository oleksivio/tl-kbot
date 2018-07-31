package ru.ioleksiv.telegram.bot.core.model.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

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
}
