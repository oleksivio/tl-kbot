package ru.ioleksiv.telegram.bot.core.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatstickerset">setChatStickerSet</a>
 */
public class SetChatStickerSet extends ChatAction<Boolean> {
    private static final String METHOD = "setChatStickerSet";
    /**
     * sticker_set_name	String Name of the sticker set to be set as the group sticker set
     */
    @JsonProperty("sticker_set_name")
    private String stickerSetName = null;

    public SetChatStickerSet(Networker networker) {
        super(METHOD, networker);
    }

    public String getStickerSetName() {
        return stickerSetName;
    }

    public SetChatStickerSet setStickerSetName(String stickerSetName) {
        this.stickerSetName = stickerSetName;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public SetChatStickerSet setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SetChatStickerSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
