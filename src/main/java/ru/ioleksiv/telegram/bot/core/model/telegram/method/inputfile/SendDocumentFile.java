package ru.ioleksiv.telegram.bot.core.model.telegram.method.inputfile;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * @link https://core.telegram.org/bots/api#senddocument
 */
public class SendDocumentFile extends UploadFile {
    private static final String METHOD = "sendDocument";

    /**
     * document	InputFile or String File to send. Pass a file_id as String to send a file that
     * exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to
     * get a file from the Internet, or upload a new one using multipart/form-data.
     */
    private static final String DOCUMENT_KEY = "document";

    public SendDocumentFile(Networker networker) {
        super(METHOD, networker);
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
