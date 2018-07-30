package ru.ioleksiv.telegram.bot.core.model.method.file;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;

/**
 * @see <a href="https://core.telegram.org/bots/api#senddocument">sendDocument</a>
 */
public class SendDocumentFile extends UploadFile {
    private static final String METHOD = "sendDocument";

    /**
     * document	InputFile or String File to send. Pass a file_id as String to send a file that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a file from the Internet, or upload a new one using multipart/form-data.
     */
    private static final String DOCUMENT_KEY = "document";
    /**
     * thumb	InputFile or String	Optional	Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
     */
    private static final String THUMB_KEY = "thumb";

    public SendDocumentFile(Networker networker) {
        super(METHOD, networker);
    }

    public SendDocumentFile setThumb(FileSystemResource thumb) {
        putFile(THUMB_KEY, thumb);
        return this;
    }

    public SendDocumentFile setDocument(FileSystemResource document) {
        putFile(DOCUMENT_KEY, document);
        return this;
    }

    public SendDocumentFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    public SendDocumentFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    public SendDocumentFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendDocumentFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    public SendDocumentFile setParseMode(String parseMode) {
        putString(PARSE_MODE_KEY, parseMode);
        return this;
    }

    public SendDocumentFile setCaption(String caption) {
        putString(CAPTION_KEY, caption);
        return this;
    }

}
