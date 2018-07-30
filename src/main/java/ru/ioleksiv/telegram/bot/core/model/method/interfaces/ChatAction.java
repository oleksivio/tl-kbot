package ru.ioleksiv.telegram.bot.core.model.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public abstract class ChatAction<RES> extends RunnableAction<RES> {
    private static final Logger LOG = LoggerFactory.getLogger(ChatAction.class);
    /**
     * chat_id	Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId = null;

    protected ChatAction(String method, Networker networker) {
        super(method, networker);
    }

    public void pSetChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public abstract ChatAction<RES> setChatId(Long chatId);

}