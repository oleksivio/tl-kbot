package io.github.oleksivio.telegram.bot.api.model.method.group;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.ChatResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchat">getChat</a>
 */
public class GetChat extends ChatAction<Chat> {
    private static final String METHOD = "getChat";

    public GetChat(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Chat>> getResultWrapperClass() {
        return ChatResponse.class;
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
