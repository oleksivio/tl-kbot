package ru.ioleksiv.telegram.bot.core.model.telegram.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.FileAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @param <T> inputfile or string
 * @link https://core.telegram.org/bots/api#sendphoto
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

    @Override
    public SendPhoto<T> setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendPhoto<T> setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendPhoto<T> setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendPhoto<T> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendPhoto<T> setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendPhoto<T> setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }

}
