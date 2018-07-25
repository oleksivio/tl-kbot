package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.FileAction;

/**
 * @link https://core.telegram.org/bots/api#senddocument
 * @param <T> inputFile or String
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


}
