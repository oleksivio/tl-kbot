package ru.ioleksiv.telegram.bot.api.model.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#createnewstickerset>createNewStickerSet</a>
 */
public class CreateNewStickerSet extends RunnableAction<Boolean> {
    private static final String METHOD = "createNewStickerSet";
    /**
     * user_id Integer Yes User identifier of created sticker set owner
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * name String Yes Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
     */
    @JsonProperty("name")
    private String name = null;
    /**
     * title String Yes Sticker set title, 1-64 characters
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * png_sticker  String Yes Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet
     */
    @JsonProperty("png_sticker")
    private String pngSticker = null;
    /**
     * emojis String Yes One or more emoji corresponding to the sticker
     */
    @JsonProperty("emojis")
    private String emojis = null;
    /**
     * contains_masks Boolean Optional Pass True, if a set of mask stickers should be created
     */
    @JsonProperty("contains_masks")
    private Boolean containsMasks = null;
    /**
     * mask_position MaskPosition Optional A JSON-serialized object for position where the mask should be placed on faces
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition = null;

    public CreateNewStickerSet(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Long getUserId() {
        return userId;
    }

    public CreateNewStickerSet setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    public String getName() {
        return name;
    }

    public CreateNewStickerSet setName(String name) {
        this.name = name;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CreateNewStickerSet setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPngSticker() {
        return pngSticker;
    }

    public CreateNewStickerSet setPngSticker(String pngSticker) {
        this.pngSticker = pngSticker;
        return this;
    }

    public String getEmojis() {
        return emojis;
    }

    public CreateNewStickerSet setEmojis(String emojis) {
        this.emojis = emojis;
        return this;
    }

    public Boolean getContainsMasks() {
        return containsMasks;
    }

    public CreateNewStickerSet setContainsMasks(Boolean containsMasks) {
        this.containsMasks = containsMasks;
        return this;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public CreateNewStickerSet setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    @Override
    public CreateNewStickerSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
