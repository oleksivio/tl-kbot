package ru.ioleksiv.telegram.bot.core.model.method.location;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.method.EditAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#stopmessagelivelocation">stopMessageLiveLocation</a>
 */
public abstract class StopMessageLiveLocation<RES> extends EditAction<RES> {
    private static final String METHOD = "stopMessageLiveLocation";

    public StopMessageLiveLocation(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    public ChatAction<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public StopMessageLiveLocation<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public StopMessageLiveLocation<RES> setInlineMessageId(String inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public StopMessageLiveLocation<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public StopMessageLiveLocation<RES> setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
