package io.github.oleksivio.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;

public abstract class ChatAction<RES> extends RunnableAction<RES> {
    /**
     * chat_id Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId = null;

    protected ChatAction(String method, ActionNetworker actionNetworker) {
        super(method, actionNetworker);
    }

    protected void pSetChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public abstract ChatAction<RES> setChatId(Long chatId);

}
