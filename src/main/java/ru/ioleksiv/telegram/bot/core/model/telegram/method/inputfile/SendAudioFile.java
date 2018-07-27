package ru.ioleksiv.telegram.bot.core.model.telegram.method.inputfile;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#sendaudio
 */
public class SendAudioFile extends UploadFile {
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

    public SendAudioFile(Networker networker) {
        super(METHOD, networker);
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
}
