package io.github.oleksivio.telegram.bot.api.model.method.group;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.UploadFile;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import org.springframework.core.io.FileSystemResource;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatphoto">setChatPhoto</a>
 */
public class SetChatPhoto extends UploadFile<Boolean> {
    private static final String METHOD = "setChatPhoto";

    /**
     * chat_id Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    private static final String CHAT_ID_KEY = "chat_id";
    /**
     * photo InputFile New chat photo, uploaded using multipart/form-data
     */
    private static final String PHOTO_KEY = "photo";

    public SetChatPhoto(FileNetworker fileNetworker) {
        super(METHOD, fileNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    public SetChatPhoto setPhoto(FileSystemResource photo) {
        putFile(PHOTO_KEY, photo);
        return this;
    }

    public SetChatPhoto setChatId(Long chatId) {
        putLong(CHAT_ID_KEY, chatId);
        return this;
    }

    @Override
    public SetChatPhoto setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
