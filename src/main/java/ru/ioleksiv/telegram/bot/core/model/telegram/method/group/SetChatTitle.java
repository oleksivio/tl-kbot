package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchattitle>setChatTitle</a>
 */
public class SetChatTitle extends ChatAction<Boolean> {
    private static final String METHOD = "setChatTitle";

    /**
     * title	String	Yes	New chat title, 1-255 characters
     */
    @JsonProperty("title")
    private String title;

    protected SetChatTitle(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public String getTitle() {
        return title;
    }

    public SetChatTitle setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public SetChatTitle setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
