package ru.ioleksiv.telegram.bot.api.model.method.sticker;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;
import ru.ioleksiv.telegram.bot.core.controller.network.FileNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.UploadFile;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#createnewstickerset>createNewStickerSet</a>
 */
public class CreateNewStickerFileSet extends UploadFile<Boolean> {
    private static final String METHOD = "createNewStickerSet";
    /**
     * user_id	Integer	Yes	User identifier of created sticker set owner
     */
    private static final String USER_ID_KEY = "user_id";
    /**
     * name	String	Yes	Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
     */
    private static final String NAME_KEY = "name";
    /**
     * title	String	Yes	Sticker set title, 1-64 characters
     */
    private static final String TITLE_KEY = "title";
    /**
     * png_sticker	InputFile 	Yes	Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. upload a new one using multipart/form-data.
     */
    private static final String PNG_STICKER_KEY = "png_sticker";
    /**
     * emojis	String	Yes	One or more emoji corresponding to the sticker
     */
    private static final String EMOJIS_KEY = "emojis";
    /**
     * contains_masks	Boolean	Optional	Pass True, if a set of mask stickers should be created
     */
    private static final String CONTAINS_MASKS_KEY = "contains_masks";
    /**
     * mask_position	MaskPosition	Optional	A JSON-serialized object for position where the mask should be placed on faces
     */
    private static final String MASK_POSITON_KEY = "mask_position";

    public CreateNewStickerFileSet(FileNetworker fileNetworker) {
        super(METHOD, fileNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public CreateNewStickerFileSet setUserId(Long userId) {
        putLong(USER_ID_KEY, userId);
        return this;
    }

    public CreateNewStickerFileSet setEmojis(String emojis) {
        putString(EMOJIS_KEY, emojis);
        return this;
    }

    public CreateNewStickerFileSet setContainsMasks(Boolean containsMasks) {
        putBool(CONTAINS_MASKS_KEY, containsMasks);
        return this;
    }

    public CreateNewStickerFileSet setMaskPosition(MaskPosition maskPosition) {
        putObject(MASK_POSITON_KEY, maskPosition);
        return this;
    }

    public CreateNewStickerFileSet setName(String name) {
        putString(NAME_KEY, name);
        return this;
    }

    public CreateNewStickerFileSet setTitle(String title) {
        putString(TITLE_KEY, title);
        return this;
    }

    public CreateNewStickerFileSet setPngSticker(FileSystemResource fileSystemResource) {
        putFile(PNG_STICKER_KEY, fileSystemResource);
        return this;
    }

    @Override
    public CreateNewStickerFileSet setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
