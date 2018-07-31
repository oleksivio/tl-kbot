package ru.ioleksiv.telegram.bot.core.model.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.EditAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.InlineKeyboardMarkup;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagereplymarkup">editMessageReplyMarkup</a>
 */
public abstract class EditMessageReplyMarkup<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageReplyMarkup";

    EditMessageReplyMarkup(Networker networker) {
        super(METHOD, networker);
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
}
