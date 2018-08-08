package ru.ioleksiv.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
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

    public SetChatTitle(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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

    @Override
    public SetChatTitle setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
