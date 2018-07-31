package ru.ioleksiv.telegram.bot.core.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.EditAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.InlineKeyboardMarkup;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagetext">editMessageText</a>
 */
public abstract class EditMessageText<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageText";
    /**
     * text	String New text of the message
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;
    /**
     * disable_web_page_preview	Boolean	Optional	Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview = null;

    EditMessageText(Networker networker) {
        super(METHOD, networker);
    }

    public String getText() {
        return text;
    }

    public EditMessageText<RES> setText(String text) {
        this.text = text;
        return this;
    }

    public String getParseMode() {
        return parseMode;
    }

    public EditMessageText<RES> setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public EditMessageText<RES> setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    @Override
    public EditMessageText<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public EditMessageText<RES> setInlineMessageId(String inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public EditMessageText<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public EditMessageText<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

}
