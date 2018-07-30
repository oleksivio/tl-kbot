package ru.ioleksiv.telegram.bot.core.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.EditAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.files.inputmedia.InputMedia;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.InlineKeyboardMarkup;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagemedia>editMessageMedia</a>
 */
public abstract class EditMessageMedia<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageMedia";
    /**
     * media	InputMedia	Yes	A JSON-serialized object for a new media content of the message
     */
    @JsonProperty("media")
    private InputMedia inputMedia = null;

    protected EditMessageMedia(Networker networker) {
        super(METHOD, networker);
    }

    public InputMedia getInputMedia() {
        return inputMedia;
    }

    protected EditMessageMedia<RES> setInputMedia(InputMedia inputMedia) {
        this.inputMedia = inputMedia;
        return this;
    }

    @Override
    public EditMessageMedia<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public EditMessageMedia<RES> setInlineMessageId(Long inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public EditMessageMedia<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public EditMessageMedia<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
