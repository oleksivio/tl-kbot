package ru.ioleksiv.telegram.bot.core.model.telegram.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.FormattedMessageAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#sendmessage
 */
public class SendMessage extends FormattedMessageAction {
    private static final String METHOD = "sendMessage";
    /**
     * text	String	Yes	Text of the message to be sent
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * disable_web_page_preview	Boolean	Optional	Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview = null;

    public SendMessage(Networker networker) {
        super(METHOD, networker);
    }

    public String getText() {
        return text;
    }

    public SendMessage setText(String text) {
        this.text = text;
        return this;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public SendMessage setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    @Override
    public SendMessage setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendMessage setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendMessage setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendMessage setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendMessage setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }
}
