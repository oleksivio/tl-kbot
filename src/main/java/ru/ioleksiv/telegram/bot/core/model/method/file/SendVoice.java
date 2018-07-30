package ru.ioleksiv.telegram.bot.core.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.CaptionAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvoice">sendVoice</a>
 */
public class SendVoice extends CaptionAction {
    private static final String METHOD = "sendVoice";
    /**
     * voice  String Audio file to send. Pass a file_id as String to send a file
     * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a file from the Internet
     */
    @JsonProperty("voice")
    private String voice = null;
    /**
     * duration	Integer	Optional	Duration of the voice message in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;

    public SendVoice(Networker networker) {
        super(METHOD, networker);
    }

    public String getVoice() {
        return voice;
    }

    public SendVoice setVoice(String voice) {
        this.voice = voice;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVoice setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public SendVoice setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendVoice setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendVoice setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVoice setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendVoice setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendVoice setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }
}
