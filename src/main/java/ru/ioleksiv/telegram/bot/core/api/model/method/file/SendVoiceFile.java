package ru.ioleksiv.telegram.bot.core.api.model.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.file.UploadMediaFile;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvoice">sendVoice</a>
 */
public class SendVoiceFile extends UploadMediaFile {
    private static final String METHOD = "sendVoice";
    /**
     * voice	InputFile or String Audio file to send. Pass a file_id as String to send a file
     * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a file from the Internet, or upload a new one using multipart/form-data.
     */
    private static final String VOICE_KEY = "voice";
    /**
     * duration	Integer	Optional	Duration of the voice message in seconds
     */
    private static final String DURATION_KEY = "duration";

    public SendVoiceFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendVoiceFile setVoice(FileSystemResource voice) {
        putFile(VOICE_KEY, voice);
        return this;
    }

    public SendVoiceFile setDuration(Integer duration) {
        putInt(DURATION_KEY, duration);
        return this;
    }

    public SendVoiceFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendVoiceFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendVoiceFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendVoiceFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendVoiceFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendVoiceFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }

    @Override
    public SendVoiceFile setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
