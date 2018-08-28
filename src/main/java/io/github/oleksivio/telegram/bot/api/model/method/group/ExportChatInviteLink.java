package io.github.oleksivio.telegram.bot.api.model.method.group;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.StringResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#exportchatinvitelink">exportChatInviteLink</a>
 */
public class ExportChatInviteLink extends ChatAction<String> {
    private static final String METHOD = "exportChatInviteLink";

    public ExportChatInviteLink(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<String>> getResultWrapperClass() {
        return StringResponse.class;
    }

    @Override
    public ExportChatInviteLink setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public ExportChatInviteLink setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
