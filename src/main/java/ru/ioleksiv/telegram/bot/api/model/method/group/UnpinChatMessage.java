package ru.ioleksiv.telegram.bot.api.model.method.group;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#unpinchatmessage">unpinChatMessage</a>
 */
public class UnpinChatMessage extends ChatAction<Boolean> {
    private static final String METHOD = "unpinChatMessage";

    public UnpinChatMessage(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
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
