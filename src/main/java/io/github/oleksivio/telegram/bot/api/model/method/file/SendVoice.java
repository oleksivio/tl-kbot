package io.github.oleksivio.telegram.bot.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.CaptionAction;

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
     * duration Integer Optional Duration of the voice message in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;

    public SendVoice(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
    public SendVoice setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendVoice setReplyToMessageId(Long replyToMessageId) {
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

    @Override
    public SendVoice setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}