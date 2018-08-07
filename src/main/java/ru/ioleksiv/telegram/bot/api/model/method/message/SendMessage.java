package ru.ioleksiv.telegram.bot.api.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.model.method.FormattedMessageAction;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendmessage">sendMessage</a>
 */
public class SendMessage extends FormattedMessageAction {
    private static final String METHOD = "sendMessage";
    /**
     * text	String Text of the message to be sent
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
    public SendMessage setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendMessage setReplyToMessageId(Long replyToMessageId) {
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

    @Override
    public SendMessage setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
