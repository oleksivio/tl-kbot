package io.github.oleksivio.telegram.bot.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#setstickerpositioninset">setStickerPositionInSet</a>
 */
public class SetStickerPositionInSet extends RunnableAction<Boolean> {
    private static final String METHOD = "setStickerPositionInSet";

    /**
     * sticker String Yes File identifier of the sticker
     */
    @JsonProperty("sticker")
    private final String sticker = null;
    /**
     * position Integer Yes New sticker position in the set, zero-based
     */
    @JsonProperty("position")
    private final Integer position = null;

    public SetStickerPositionInSet(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    @Override
    public SetStickerPositionInSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}