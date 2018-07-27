package ru.ioleksiv.telegram.bot.core.model.telegram.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.FileAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @param <T> inputFile or String
 * @link https://core.telegram.org/bots/api#senddocument
 */
public class SendDocument<T> extends FileAction {
    private static final String METHOD = "sendDocument";

    /**
     * document	InputFile or String	Yes	File to send. Pass a file_id as String to send a file that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a file from the Internet, or upload a new one using multipart/form-data.
     */
    @JsonProperty("document")
    private T document = null;

    public SendDocument(Networker networker) {
        super(METHOD, networker);
    }

    public T getDocument() {
        return document;
    }

    public SendDocument<T> setDocument(T document) {
        this.document = document;
        return this;
    }

    @Override
    public SendDocument<T> setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendDocument<T> setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendDocument<T> setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendDocument<T> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendDocument<T> setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendDocument<T> setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }

}
