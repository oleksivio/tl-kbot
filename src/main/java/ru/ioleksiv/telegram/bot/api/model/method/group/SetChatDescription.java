package ru.ioleksiv.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchatdescription">setChatDescription</a>
 */
public class SetChatDescription extends ChatAction<Boolean> {
    private static final String METHOD = "setChatDescription";
    /**
     * description	String	Optional	New chat description, 0-255 characters
     */
    @JsonProperty("description")
    private String description = null;

    public SetChatDescription(Networker networker) {
        super(METHOD, networker);
    }

    public String getDescription() {
        return description;
    }

    public SetChatDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public SetChatDescription setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SetChatDescription setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
