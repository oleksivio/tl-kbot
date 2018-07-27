package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.InlineKeyboardMarkup;

/**
 * https://core.telegram.org/bots/api#stopmessagelivelocation
 */
public abstract class StopMessageLiveLocation<RES> extends EditAction<RES> {
    private static final String METHOD = "stopMessageLiveLocation";

    StopMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
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
    public StopMessageLiveLocation<RES> setInlineMessageId(Long inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public StopMessageLiveLocation<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }
}
