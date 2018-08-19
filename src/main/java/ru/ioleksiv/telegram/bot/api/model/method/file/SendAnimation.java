package ru.ioleksiv.telegram.bot.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.file.ThumbAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendanimation>sendAnimation</a>
 */
public class SendAnimation extends ThumbAction {
    private static final String METHOD = "sendAnimation";
    /**
     * animation String Yes Animation to send. Pass a file_id as String to send an animation that exists on
     * the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the
     * Internet, or upload a new animation using multipart/form-data.
     */
    @JsonProperty("animation")
    private String animation = null;
    /**
     * duration Integer Optional Duration of sent animation in seconds
     */
    @JsonProperty("duration")
    private Integer duration = null;
    /**
     * width Integer Optional Animation width
     */
    @JsonProperty("width")
    private Integer width = null;
    /**
     * height Integer Optional Animation height
     */
    @JsonProperty("height")
    private Integer height = null;

    public SendAnimation(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getAnimation() {
        return animation;
    }

    public SendAnimation setAnimation(String animation) {
        this.animation = animation;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public SendAnimation setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SendAnimation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SendAnimation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    @Override
    public SendAnimation setThumb(String thumb) {
        pSetThumb(thumb);
        return this;
    }

    @Override
    public SendAnimation setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    public SendAnimation setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendAnimation setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendAnimation setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendAnimation setParseMode(String parseMode) {
        pSetParseMode(parseMode);
        return this;
    }

    @Override
    public SendAnimation setCaption(String caption) {

        pSetCaption(caption);
        return this;
    }

    @Override
    public SendAnimation setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
