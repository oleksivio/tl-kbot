package io.github.oleksivio.telegram.bot.api.model.method.sticker;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker;
import org.springframework.core.io.FileSystemResource;
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendsticker>sendSticker</a>
 */
public class SendStickerFile extends UploadMessageFile {
    private static final String METHOD = "sendSticker";
    /**
     * sticker InputFile Yes Sticker to send. Upload a new one using multipart/form-data.
     */
    private static final String STIKER_KEY = "sticker";

    public SendStickerFile(FileNetworker fileNetworker) {
        super(METHOD, fileNetworker);
    }

    public SendStickerFile setSticker(FileSystemResource sticker) {
        putFile(STIKER_KEY, sticker);
        return this;
    }

    public SendStickerFile setReplyMarkup(IKeyboard replyMarkup) {
        putReplyMarkup(replyMarkup);
        return this;
    }

    protected SendStickerFile setDisableNotification(Boolean disableNotification) {
        putBool(DISABLE_NOTIFICATION_KEY, disableNotification);
        return this;
    }

    protected SendStickerFile setReplyToMessageId(Long replyToMessageId) {
        putLong(REPLY_TO_MESSAGE_ID, replyToMessageId);
        return this;
    }

    public SendStickerFile setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    @Override
    public SendStickerFile setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
