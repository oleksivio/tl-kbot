package ru.ioleksiv.telegram.bot.core.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.file.ThumbAction;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#senddocument">sendDocument</a>
 */
public class SendDocument extends ThumbAction {
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
    public SendDocument setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendDocument setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendDocument setThumb(String thumb) {
        pSetThumb(thumb);
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

    @Override
    public SendDocument setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
