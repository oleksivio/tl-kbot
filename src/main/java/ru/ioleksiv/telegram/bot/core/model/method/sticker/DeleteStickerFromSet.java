package ru.ioleksiv.telegram.bot.core.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletestickerfromset>deleteStickerFromSet</a>
 */
public class DeleteStickerFromSet extends RunnableAction<Boolean> {
    private static final String METHOD = "deleteStickerFromSet";
    /**
     * sticker	String	Yes	File identifier of the sticker
     */
    @JsonProperty("sticker")
    private String sticker;

    public DeleteStickerFromSet(Networker networker) {
        super(METHOD, networker);
    }

    public String getSticker() {
        return sticker;
    }

    public DeleteStickerFromSet setSticker(String sticker) {
        this.sticker = sticker;
        return this;
    }

    @Override
   protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
