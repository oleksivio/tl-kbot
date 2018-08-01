package ru.ioleksiv.telegram.bot.core.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.MessageAction;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendsticker>sendSticker</a>
 */
public class SendSticker extends MessageAction {
    private static final String METHOD = "sendSticker";
    /**
     * sticker String	Yes	Sticker to send. Pass a file_id as String to send a file that exists on the
     * Telegram servers (recommended) or pass an HTTP URL as a String for Telegram to get a .webp file from the Internet
     */
    @JsonProperty("sticker")
    private String sticker = null;

    public SendSticker(Networker networker) {
        super(METHOD, networker);
    }

    public String getSticker() {
        return sticker;
    }

    public SendSticker setSticker(String sticker) {
        this.sticker = sticker;
        return this;
    }

    @Override
    public SendSticker setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    public SendSticker setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendSticker setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendSticker setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendSticker setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
