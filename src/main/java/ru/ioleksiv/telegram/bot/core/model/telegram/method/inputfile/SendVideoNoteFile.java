package ru.ioleksiv.telegram.bot.core.model.telegram.method.inputfile;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#sendvideonote
 */
public class SendVideoNoteFile extends UploadFile {
    private static final String METHOD = "sendVideoNote";
    /**
     * video_note	InputFile or String Video note to send. Pass a file_id as String to send a
     * video note that exists on the Telegram servers (recommended) or upload a new video using
     * multipart/form-data. More info on Sending Files ». Sending video notes by a URL is currently
     * unsupported
     */
    private static final String VIDEO_NOTE_KEY = "video_note";
    /**
     * duration	Integer	Optional	Duration of sent video in seconds
     */
    private static final String  DURATION_KEY = "duration";
    /**
     * length	Integer	Optional	Video width and height
     */
    private static final String LENGTH_KEY = "length";

    public SendVideoNoteFile(Networker networker) {
        super(METHOD, networker);
    }



    public SendVideoNoteFile setLength(Integer length) {
        putInt(LENGTH_KEY,length);
        return this;
    }

    public SendVideoNoteFile setVideoNote(FileSystemResource videoNote) {
        putFile(VIDEO_NOTE_KEY,videoNote);
        return this;
    }

    public SendVideoNoteFile setDuration(Integer duration) {
        putInt(DURATION_KEY,duration);
        return this;
    }

    public SendVideoNoteFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendVideoNoteFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendVideoNoteFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendVideoNoteFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendVideoNoteFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendVideoNoteFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }
}
