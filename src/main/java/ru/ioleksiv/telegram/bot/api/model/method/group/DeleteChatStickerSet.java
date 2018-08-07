package ru.ioleksiv.telegram.bot.api.model.method.group;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletechatstickerset">deleteChatStickerSet</a>
 */
public class DeleteChatStickerSet extends ChatAction<Boolean> {
    private static final String METHOD = "deleteChatStickerSet";

    public DeleteChatStickerSet(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public DeleteChatStickerSet setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public DeleteChatStickerSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
