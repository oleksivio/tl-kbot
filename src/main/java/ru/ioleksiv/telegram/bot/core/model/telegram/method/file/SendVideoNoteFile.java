package ru.ioleksiv.telegram.bot.core.model.telegram.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvideonote">sendVideoNote</a>
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
    /**
     * thumb	InputFile or String	Optional	Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    private static final String THUMB_KEY = "thumb";

    public SendVideoNoteFile setThumb(FileSystemResource thumb) {
        putFile(THUMB_KEY, thumb);
        return this;
    }
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
