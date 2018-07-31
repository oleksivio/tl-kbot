package ru.ioleksiv.telegram.bot.core.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.sticker.StickerSet;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getstickerset>getStickerSet</a>
 */
public class GetStickerSet extends RunnableAction<StickerSet> {
    private static final String METHOD = "getStickerSet";

    /**
     * name	String	Yes	Name of the sticker set
     */
    @JsonProperty("name")
    private String name = null;

    public GetStickerSet(Networker networker) {
        super(METHOD, networker);
    }

    public String getName() {
        return name;
    }

    public GetStickerSet setName(String name) {
        this.name = name;
        return this;
    }

    @Override
   protected Class<? extends CommonResponse<StickerSet>> getResultWrapperClass() {
        return ResponseCollection.StickerSetResponse.class;
    }
}
