package ru.ioleksiv.telegram.bot.core.model.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.ChatMember;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatadministrators">getChatAdministrators</a>
 */
public class GetChatAdministrators extends ChatAction<List<ChatMember>> {
    private static final String METHOD = "getChatAdministrators";

    protected GetChatAdministrators(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<List<ChatMember>>> getResultWrapperClass() {
        return ResponseCollection.ChatMembersResponse.class;
    }

    @Override
    public GetChatAdministrators setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
