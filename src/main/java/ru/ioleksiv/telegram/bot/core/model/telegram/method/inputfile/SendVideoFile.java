package ru.ioleksiv.telegram.bot.core.model.telegram.method.inputfile;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#sendvideo
 */
public class SendVideoFile extends UploadFile {
    private static final String METHOD = "sendVideo";
    /**
     * T
     * video	InputFile or String Video to send. Pass a file_id as String to send a video that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a video from the Internet, or upload a new video using multipart/form-data.
     */
    private static final String VIDEO_KEY = "video";

    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    private static final String DURATION_KEY = "duration";
    /**
     * width	Integer	Optional	Video width
     */
    private static final String WIDTH_KEY = "width";
    /**
     * height	Integer	Optional	Video height
     */
    private static final String HEIGHT_KEY = "height";
    /**
     * supports_streaming	Boolean	Optional	Pass True, if the uploaded video is suitable for streaming
     */
    private static final String SUPPORTS_STREAMING_KEY = "supports_streaming";

    public SendVideoFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendVideoFile setVideo(FileSystemResource video) {
        putFile(VIDEO_KEY, video);
        return this;
    }

    public SendVideoFile setDuration(Integer duration) {
        putInt(DURATION_KEY, duration);
        return this;
    }

    public SendVideoFile setWidth(Integer width) {
        putInt(WIDTH_KEY, width);
        return this;
    }

    public SendVideoFile setHeight(Integer height) {
        putInt(HEIGHT_KEY, height);
        return this;
    }

    public SendVideoFile setSupportsStreaming(boolean supportsStreaming) {
        putBool(SUPPORTS_STREAMING_KEY, supportsStreaming);
        return this;
    }

    public SendVideoFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendVideoFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendVideoFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendVideoFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendVideoFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendVideoFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }
}
