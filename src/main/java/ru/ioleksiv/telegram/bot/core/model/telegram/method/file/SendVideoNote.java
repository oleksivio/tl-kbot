package ru.ioleksiv.telegram.bot.core.model.telegram.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvideonote">sendVideoNote</a>
 */
public class SendVideoNote extends ThumbAction {
    private static final String METHOD = "sendVideoNote";
    /**
     * video_note	String	Video note to send. Pass a file_id as String to send a
     * video note that exists on the Telegram servers (recommended).
     * Sending video notes by a URL is currently unsupported
     */
    @JsonProperty("video_note")
    private String videoNote = null;
    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * length	Integer	Optional	Video width and height
     */
    @JsonProperty("length")
    private Integer length;

    public SendVideoNote(Networker networker) {
        super(METHOD, networker);
    }

    public Integer getLength() {
        return length;
    }

    public SendVideoNote setLength(Integer length) {
        this.length = length;
        return this;
    }

    public String getVideoNote() {
        return videoNote;
    }

    public SendVideoNote setVideoNote(String videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVideoNote setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public SendVideoNote setThumb(String thumb) {
        pSetThumb(thumb);
        return this;
    }

    @Override
    public SendVideoNote setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendVideoNote setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendVideoNote setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVideoNote setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendVideoNote setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendVideoNote setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }
}
