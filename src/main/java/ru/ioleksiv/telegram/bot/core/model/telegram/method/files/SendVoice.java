package ru.ioleksiv.telegram.bot.core.model.telegram.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.FileAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#sendvoice
 */
public class SendVoice<T> extends FileAction {
    private static final String METHOD = "sendVoice";
    /**
     * voice	InputFile or String	Yes	Audio file to send. Pass a file_id as String to send a file
     * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a file from the Internet, or upload a new one using multipart/form-data.
     */
    @JsonProperty("voice")
    private T voice = null;
    /**
     * duration	Integer	Optional	Duration of the voice message in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;

    public SendVoice(Networker networker) {
        super(METHOD, networker);
    }

    public T getVoice() {
        return voice;
    }

    public SendVoice<T> setVoice(T voice) {
        this.voice = voice;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVoice<T> setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public SendVoice<T> setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendVoice<T> setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendVoice<T> setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVoice<T> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendVoice<T> setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendVoice<T> setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }
}
