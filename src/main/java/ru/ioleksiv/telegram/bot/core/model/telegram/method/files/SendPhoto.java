package ru.ioleksiv.telegram.bot.core.model.telegram.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.FileAction;

/**
 * @link https://core.telegram.org/bots/api#sendphoto
 * @param <T> inputfile or string
 */
public class SendPhoto<T> extends FileAction {
    private static final String METHOD = "sendPhoto";
    /**
     * photo	InputFile or String	Yes	Photo to send. Pass a file_id as String to send a photo that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a photo from the Internet, or upload a new photo using multipart/form-data.
     */
    @JsonProperty("photo")
    private T photo = null;

    public SendPhoto(Networker networker) {
        super(METHOD, networker);
    }

    public T getPhoto() {
        return photo;
    }

    public SendPhoto<T> setPhoto(T photo) {
        this.photo = photo;
        return this;
    }

}
