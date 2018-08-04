package ru.ioleksiv.telegram.bot.core.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.CaptionAction;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendphoto">sendPhoto</a>
 */
public class SendPhoto extends CaptionAction {
    private static final String METHOD = "sendPhoto";
    /**
     * photo	 String		Photo to send. Pass a file_id as String to send a photo that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a photo from the Internet
     */
    @JsonProperty("photo")
    private String photo = null;

    public SendPhoto(Networker networker) {
        super(METHOD, networker);
    }

    public String getPhoto() {
        return photo;
    }

    public SendPhoto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public SendPhoto setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    public SendPhoto setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendPhoto setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendPhoto setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendPhoto setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendPhoto setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }

    @Override
    public SendPhoto setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}