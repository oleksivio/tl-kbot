package ru.ioleksiv.telegram.bot.core.model.telegram.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.CaptionAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#senddocument
 */
public class SendDocument extends CaptionAction {
    private static final String METHOD = "sendDocument";

    /**
     * document	 String		File to send. Pass a file_id as String to send a file that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a file from the Internet
     */
    @JsonProperty("document")
    private String document = null;

    public SendDocument(Networker networker) {
        super(METHOD, networker);
    }

    public String getDocument() {
        return document;
    }

    public SendDocument setDocument(String document) {
        this.document = document;
        return this;
    }

    @Override
    public SendDocument setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendDocument setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendDocument setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendDocument setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendDocument setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendDocument setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }

}
