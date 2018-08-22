package ru.ioleksiv.telegram.bot.api.model.method.group;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.StringResponse;

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
