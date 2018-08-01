package ru.ioleksiv.telegram.bot.core.api.model.method.group;

import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#exportchatinvitelink">exportChatInviteLink</a>
 */
public class ExportChatInviteLink extends ChatAction<String> {
    private static final String METHOD = "exportChatInviteLink";

    public ExportChatInviteLink(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<String>> getResultWrapperClass() {
        return ResponseCollection.StringResponse.class;
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
