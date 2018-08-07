package ru.ioleksiv.telegram.bot.core.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.EditAction;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagecaption">editMessageCaption</a>
 */
public abstract class EditMessageCaption<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageCaption";
    /**
     * caption	String	Optional	New caption of the message
     */
    @JsonProperty("caption")
    private String caption = null;
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;

    protected EditMessageCaption(Networker networker) {
        super(METHOD, networker);
    }

    public String getCaption() {
        return caption;
    }

    public EditMessageCaption<RES> setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getParseMode() {
        return parseMode;
    }

    public EditMessageCaption<RES> setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    @Override
    public EditMessageCaption<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public EditMessageCaption<RES> setInlineMessageId(String inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public EditMessageCaption<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public EditMessageCaption<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public EditMessageCaption<RES> setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
