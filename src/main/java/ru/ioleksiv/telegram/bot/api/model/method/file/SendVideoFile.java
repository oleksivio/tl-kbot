package ru.ioleksiv.telegram.bot.api.model.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.model.method.file.UploadMediaFile;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvideo">sendVideo</a>
 */
public class SendVideoFile extends UploadMediaFile {
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
    /**
     * thumb	InputFile or String	Optional	Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    private static final String THUMB_KEY = "thumb";

    public SendVideoFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendVideoFile setThumb(FileSystemResource thumb) {
        putFile(THUMB_KEY, thumb);
        return this;
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

    @Override
    public SendVideoFile setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
