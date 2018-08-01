package ru.ioleksiv.telegram.bot.core.api.model.method.group;

import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#unpinchatmessage">unpinChatMessage</a>
 */
public class UnpinChatMessage extends ChatAction<Boolean> {
    private static final String METHOD = "unpinChatMessage";

    public UnpinChatMessage(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public UnpinChatMessage setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public UnpinChatMessage setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
