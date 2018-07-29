package ru.ioleksiv.telegram.bot.core.model.telegram.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendanimation>sendAnimation</a>
 */
public class SendAnimation extends ThumbAction {
    private static final String METHOD = "sendAnimation";
    /**
     * animation	InputFile or String	Yes	Animation to send. Pass a file_id as String to send an animation that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get an animation from the Internet, or upload a new animation using multipart/form-data. More info on Sending Files »
     */
    @JsonProperty("animation")
    private String animation;
    /**
     * duration	Integer	Optional	Duration of sent animation in seconds
     */
    @JsonProperty("duration")
    private Integer duration;
    /**
     * width	Integer	Optional	Animation width
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * height	Integer	Optional	Animation height
     */
    @JsonProperty("height")
    private Integer height;

    public SendAnimation(Networker networker) {
        super(METHOD, networker);
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
    protected SendAnimation setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendAnimation setReplyToMessageId(Long replyToMessageId) {
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
}
