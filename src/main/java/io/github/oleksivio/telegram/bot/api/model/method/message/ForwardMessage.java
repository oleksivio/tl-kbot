package io.github.oleksivio.telegram.bot.api.model.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.MessageResponse;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;

/**
 * @see <a href="https://core.telegram.org/bots/api#forwardmessage">forwardMessage</a>
 */
public class ForwardMessage extends ChatAction<Message> {
    private static final String FORWARD_MESSAGE = "forwardMessage";
    /**
     * from_chat_id Integer or String Unique identifier for the chat where the original message
     * was sent (or channel username in the format @channelusername)
     */
    @JsonProperty("from_chat_id")
    private Long fromChatId = null;
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * message_id Integer Message identifier in the chat specified in from_chat_id
     */
    @JsonProperty("message_id")
    private Long messageId = null;

    public ForwardMessage(ActionNetworker actionNetworker) {
        super(FORWARD_MESSAGE, actionNetworker);
    }

    public Long getFromChatId() {
        return fromChatId;
    }

    public ForwardMessage setFromChatId(Long fromChatId) {
        this.fromChatId = fromChatId;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public ForwardMessage setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public ForwardMessage setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return MessageResponse.class;
    }

    @Override
    public ForwardMessage setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public ForwardMessage setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
