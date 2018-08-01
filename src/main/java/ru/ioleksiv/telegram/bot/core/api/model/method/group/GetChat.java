package ru.ioleksiv.telegram.bot.core.api.model.method.group;

import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Chat;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchat">getChat</a>
 */
public class GetChat extends ChatAction<Chat> {
    private static final String METHOD = "getChat";

    public GetChat(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Chat>> getResultWrapperClass() {
        return ResponseCollection.ChatResponse.class;
    }

    @Override
    public GetChat setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public GetChat setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
