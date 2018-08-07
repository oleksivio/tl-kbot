package ru.ioleksiv.telegram.bot.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#setstickerpositioninset>setStickerPositionInSet</a>
 */
public class SetStickerPositionInSet extends RunnableAction<Boolean> {
    private static final String METHOD = "setStickerPositionInSet";

    /**
     * sticker	String	Yes	File identifier of the sticker
     */
    @JsonProperty("sticker")
    private String sticker = null;
    /**
     * position	Integer	Yes	New sticker position in the set, zero-based
     */
    @JsonProperty("position")
    private Integer position = null;

    public SetStickerPositionInSet(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public SetStickerPositionInSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
