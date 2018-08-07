package ru.ioleksiv.telegram.bot.api.model.method.group;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.ChatMember;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatadministrators">getChatAdministrators</a>
 */
public class GetChatAdministrators extends ChatAction<List<ChatMember>> {
    private static final String METHOD = "getChatAdministrators";

    public GetChatAdministrators(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<List<ChatMember>>> getResultWrapperClass() {
        return ResponseCollection.ChatMembersResponse.class;
    }

    @Override
    public GetChatAdministrators setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public GetChatAdministrators setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
