package ru.ioleksiv.telegram.bot.core.api.model.method.sticker;

import org.springframework.core.io.FileSystemResource;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.files.File;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.UploadFile;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#uploadstickerfile>uploadStickerFile</a>
 */
public class UploadStickerFile extends UploadFile<File> {
    private static final String METHOD = "uploadStickerFile";
    /**
     * user_id	Integer	Yes	User identifier of sticker file owner
     */
    private static final String USER_ID_KEY = "user_id";
    /**
     * png_sticker	InputFile	Yes	Png image with the sticker, must be up to 512 kilobytes in size,
     * dimensions must not exceed 512px, and either width or height must be exactly 512px.
     */
    private static final String PNG_STICKER_KEY = "png_sticker";

    public UploadStickerFile(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    protected Class<? extends CommonResponse<File>> getResultWrapperClass() {
        return ResponseCollection.FileResponse.class;
    }

    public UploadStickerFile setPngSticker(FileSystemResource pngSticker) {
        putFile(PNG_STICKER_KEY, pngSticker);
        return this;
    }

    public UploadStickerFile setUserId(Long userId) {
        putLong(PNG_STICKER_KEY, userId);
        return this;
    }

    @Override
    public UploadStickerFile setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
