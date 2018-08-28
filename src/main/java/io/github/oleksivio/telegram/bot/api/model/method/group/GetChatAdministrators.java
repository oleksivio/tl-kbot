package io.github.oleksivio.telegram.bot.api.model.method.group;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.ChatMembersResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#getchatadministrators">getChatAdministrators</a>
 */
public class GetChatAdministrators extends ChatAction<List<ChatMember>> {
    private static final String METHOD = "getChatAdministrators";

    public GetChatAdministrators(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<List<ChatMember>>> getResultWrapperClass() {
        return ChatMembersResponse.class;
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
