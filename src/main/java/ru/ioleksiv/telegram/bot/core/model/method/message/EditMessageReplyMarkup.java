package ru.ioleksiv.telegram.bot.core.model.method.message;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.EditAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagereplymarkup">editMessageReplyMarkup</a>
 */
public abstract class EditMessageReplyMarkup<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageReplyMarkup";

    public EditMessageReplyMarkup(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    public EditMessageReplyMarkup<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public EditMessageReplyMarkup<RES> setInlineMessageId(String inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public EditMessageReplyMarkup<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public EditMessageReplyMarkup<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public EditMessageReplyMarkup<RES> setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
