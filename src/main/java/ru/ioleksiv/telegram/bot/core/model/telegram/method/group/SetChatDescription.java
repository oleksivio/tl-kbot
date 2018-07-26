package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatdescription>setChatDescription</a>
 */
public class SetChatDescription  extends ChatAction<Boolean > {
    private static final String METHOD = "setChatDescription";
    /**
     * description	String	Optional	New chat description, 0-255 characters
     */
    @JsonProperty("description")
    private String description;

    protected SetChatDescription(Networker networker) {
        super(METHOD, networker);
    }

    public String getDescription() {
        return description;
    }

    public SetChatDescription  setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }
}
