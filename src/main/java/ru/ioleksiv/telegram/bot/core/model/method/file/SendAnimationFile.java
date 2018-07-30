package ru.ioleksiv.telegram.bot.core.model.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendanimation>sendAnimation</a>
 */
public class SendAnimationFile extends UploadFile {
    private static final String METHOD = "sendAnimation";

    /**
     * animation	InputFile or String	Yes	Animation to send. Pass a file_id as String to send an
     * animation that exists on the Telegram servers (recommended), pass an HTTP URL as a String
     * for Telegram to get an animation from the Internet, or upload a new animation using
     * multipart/form-data.
     */
    private static final String ANIMATION_KEY = "animation";
    /**
     * duration	Integer	Optional	Duration of sent animation in seconds
     */
    private static final String DURATION_KEY = "duration";
    /**
     * width	Integer	Optional	Animation width
     */
    private static final String WIDTH_KEY = "width";
    /**
     * height	Integer	Optional	Animation height
     */
    private static final String HEIGHT_KEY = "height";
    /**
     * thumb	InputFile or String	Optional	Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    private static final String THUMB_KEY = "thumb";

    public SendAnimationFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendAnimationFile setThumb(FileSystemResource thumb) {
        putFile(THUMB_KEY, thumb);
        return this;
    }

    public SendAnimationFile setAnimation(FileSystemResource animation) {
        putFile(ANIMATION_KEY, animation);
        return this;
    }

    public SendAnimationFile setDuration(Integer duration) {
        putInt(DURATION_KEY, duration);
        return this;
    }

    public SendAnimationFile setWidth(Integer width) {
        putInt(WIDTH_KEY, width);
        return this;
    }

    public SendAnimationFile setHeight(Integer height) {
        putInt(HEIGHT_KEY, height);
        return this;
    }

    public SendAnimationFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendAnimationFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendAnimationFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendAnimationFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendAnimationFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendAnimationFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }

}
