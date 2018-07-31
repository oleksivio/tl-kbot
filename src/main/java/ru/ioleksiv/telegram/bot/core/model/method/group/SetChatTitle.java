package ru.ioleksiv.telegram.bot.core.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#setchattitle">setChatTitle</a>
 */
public class SetChatTitle extends ChatAction<Boolean> {
    private static final String METHOD = "setChatTitle";

    /**
     * title	String New chat title, 1-255 characters
     */
    @JsonProperty("title")
    private String title = null;

    public SetChatTitle(Networker networker) {
        super(METHOD, networker);
    }

    @Override
   protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
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
