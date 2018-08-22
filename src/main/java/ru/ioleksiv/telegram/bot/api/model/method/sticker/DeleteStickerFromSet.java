package ru.ioleksiv.telegram.bot.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletestickerfromset>deleteStickerFromSet</a>
 */
public class DeleteStickerFromSet extends RunnableAction<Boolean> {
    private static final String METHOD = "deleteStickerFromSet";
    /**
     * sticker String Yes File identifier of the sticker
     */
    @JsonProperty("sticker")
    private String sticker = null;

    public DeleteStickerFromSet(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
        return BooleanResponse.class;
    }

    @Override
    public DeleteStickerFromSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
