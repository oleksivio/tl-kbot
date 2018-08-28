package io.github.oleksivio.telegram.bot.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.CaptionAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendphoto">sendPhoto</a>
 */
public class SendPhoto extends CaptionAction {
    private static final String METHOD = "sendPhoto";
    /**
     * photo  String  Photo to send. Pass a file_id as String to send a photo that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a photo from the Internet
     */
    @JsonProperty("photo")
    private String photo = null;

    public SendPhoto(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
