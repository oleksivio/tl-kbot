package io.github.oleksivio.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatstickerset">setChatStickerSet</a>
 */
public class SetChatStickerSet extends ChatAction<Boolean> {
    private static final String METHOD = "setChatStickerSet";
    /**
     * sticker_set_name String Name of the sticker set to be set as the group sticker set
     */
    @JsonProperty("sticker_set_name")
    private String stickerSetName = null;

    public SetChatStickerSet(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
        return BooleanResponse.class;
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
