package ru.ioleksiv.telegram.bot.core.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletemessage">deleteMessage</a>
 */
public class DeleteMessage extends ChatAction<Boolean> {
    private static final String METHOD = "deleteMessage";

    /**
     * message_id	Integer Identifier of the message to delete
     */
    @JsonProperty("message_id")
    private Long messageId = null;

    public DeleteMessage(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public Long getMessageId() {
        return messageId;
    }

    public DeleteMessage setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    public DeleteMessage setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}