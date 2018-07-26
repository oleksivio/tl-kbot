package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

import java.io.File;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatphoto>setChatPhoto</a>
 */
public class SetChatPhoto  extends ChatAction<Boolean > {
    private static final String METHOD = "setChatPhoto";
    /**
     * photo	InputFile	Yes	New chat photo, uploaded using multipart/form-data
     */
    @JsonProperty("photo")
    private File photo;

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

    public SetChatPhoto  setPhoto(File photo) {
        this.photo = photo;
        return this;
    }
}
