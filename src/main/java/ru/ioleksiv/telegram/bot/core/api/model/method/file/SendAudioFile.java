package ru.ioleksiv.telegram.bot.core.api.model.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.file.UploadMediaFile;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendaudio">sendAudio</a>
 */
public class SendAudioFile extends UploadMediaFile {
    private static final String METHOD = "sendAudio";

    /**
     * audio	InputFile Audio file to send. Upload a new
     * file using multipart/form-data.
     */
    private static final String AUDIO_KEY = "audio";
    /**
     * duration	Integer	Optional	Duration of the audio in seconds
     */
    private static final String DURATION_KEY = "duration";
    /**
     * performer	String	Optional	Performer
     */
    private static final String PERFORMER_KEY = "performer";
    /**
     * title	String	Optional	Track name
     */
    private static final String TITLE_KEY = "title";
    /**
     * thumb	InputFile or String	Optional	Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    private static final String THUMB_KEY = "thumb";

    public SendAudioFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendAudioFile setThumb(FileSystemResource thumb) {
        putFile(THUMB_KEY, thumb);
        return this;
    }

    public SendAudioFile setDuration(Integer duration) {
        putInt(DURATION_KEY, duration);
        return this;
    }

    public SendAudioFile setPerformer(String performer) {
        putString(PERFORMER_KEY, performer);
        return this;
    }

    public SendAudioFile setTitle(String title) {
        putString(TITLE_KEY, title);
        return this;
    }

    public SendAudioFile setAudio(FileSystemResource audio) {
        putFile(AUDIO_KEY, audio);
        return this;
    }

    public SendAudioFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendAudioFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendAudioFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendAudioFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendAudioFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendAudioFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }

    @Override
    public SendAudioFile setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
