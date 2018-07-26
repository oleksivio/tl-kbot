package ru.ioleksiv.telegram.bot.core.model.telegram.method.message;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagereplymarkup>editMessageReplyMarkup</a>
 */
abstract class EditMessageReplyMarkup<RES > extends EditAction<RES > {
    private static final String METHOD = "editMessageReplyMarkup";

    EditMessageReplyMarkup(Networker networker) {
        super(METHOD, networker);
    }
}
