package io.github.oleksivio.telegram.bot.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.StickerSetResponse;
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.StickerSet;

/**
 * @see <a href="https://core.telegram.org/bots/api#getstickerset>getStickerSet</a>
 */
public class GetStickerSet extends RunnableAction<StickerSet> {
    private static final String METHOD = "getStickerSet";

    /**
     * name String Yes Name of the sticker set
     */
    @JsonProperty("name")
    private String name = null;

    public GetStickerSet(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
        return StickerSetResponse.class;
    }

    @Override
    public GetStickerSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
