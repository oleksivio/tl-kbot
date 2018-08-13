package ru.ioleksiv.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.io.File;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatphoto">setChatPhoto</a>
 */
public class SetChatPhoto extends ChatAction<Boolean> {
    private static final String METHOD = "setChatPhoto";
    /**
     * photo InputFile New chat photo, uploaded using multipart/form-data
     */
    @JsonProperty("photo")
    private File photo = null;

    public SetChatPhoto(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public File getPhoto() {
        return photo;
    }

    public SetChatPhoto setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public SetChatPhoto setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SetChatPhoto setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
