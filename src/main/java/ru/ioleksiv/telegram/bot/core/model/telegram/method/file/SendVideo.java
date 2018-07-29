package ru.ioleksiv.telegram.bot.core.model.telegram.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvideo">sendVideo</a>
 */
public class SendVideo extends ThumbAction {
    private static final String METHOD = "sendVideo";
    /**
     * video  String	Video to send. Pass a file_id as String to send a video that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a video from the Internet
     */
    @JsonProperty("video")
    private String video = null;

    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * width	Integer	Optional	Video width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height	Integer	Optional	Video height
     */
    @JsonProperty("height")
    private Integer height = null;
    /**
     * supports_streaming	Boolean	Optional	Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming = null;

    public SendVideo(Networker networker) {
        super(METHOD, networker);
    }

    public String getVideo() {
        return video;
    }

    public SendVideo setVideo(String video) {
        this.video = video;
        return this;
    }

    @Override
    public SendVideo setThumb(String thumb) {
        pSetThumb(thumb);
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendVideo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SendVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SendVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getSupportsStreaming() {
        return supportsStreaming;
    }

    public SendVideo setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }

    @Override
    public SendVideo setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    protected SendVideo setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendVideo setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVideo setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendVideo setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendVideo setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }
}
