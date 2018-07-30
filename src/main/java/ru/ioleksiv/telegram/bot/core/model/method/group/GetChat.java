package ru.ioleksiv.telegram.bot.core.model.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Chat;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchat">getChat</a>
 */
public class GetChat extends ChatAction<Chat> {
    private static final String METHOD = "getChat";

    protected GetChat(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Chat>> getResultWrapperClass() {
        return ResponseCollection.ChatResponse.class;
    }

    @Override
    public GetChat setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
