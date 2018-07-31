package ru.ioleksiv.telegram.bot.core.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#setstickerpositioninset>setStickerPositionInSet</a>
 */
public class SetStickerPositionInSet extends RunnableAction<Boolean> {
    private static final String METHOD = "setStickerPositionInSet";

    /**
     * sticker	String	Yes	File identifier of the sticker
     */
    @JsonProperty("sticker")
    private String sticker;
    /**
     * position	Integer	Yes	New sticker position in the set, zero-based
     */
    @JsonProperty("position")
    private Integer position;

    public SetStickerPositionInSet(Networker networker) {
        super(METHOD, networker);
    }

    @Override
   protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
