package ru.ioleksiv.telegram.bot.core.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.io.File;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatphoto">setChatPhoto</a>
 */
public class SetChatPhoto extends ChatAction<Boolean> {
    private static final String METHOD = "setChatPhoto";
    /**
     * photo	InputFile New chat photo, uploaded using multipart/form-data
     */
    @JsonProperty("photo")
    private File photo = null;

    protected SetChatPhoto(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
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
}