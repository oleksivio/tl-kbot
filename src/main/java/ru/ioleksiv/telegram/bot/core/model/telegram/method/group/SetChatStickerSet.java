package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

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

    protected SetChatStickerSet(Networker networker) {
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
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public SetChatStickerSet setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
