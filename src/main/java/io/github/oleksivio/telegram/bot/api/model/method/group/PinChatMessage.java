package io.github.oleksivio.telegram.bot.api.model.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#pinchatmessage">pinChatMessage</a>
 */
public class PinChatMessage extends ChatAction<Boolean> {
    private static final String METHOD = "pinChatMessage";
    /**
     * message_id Integer Identifier of a message to pin
     */
    @JsonProperty("message_id")
    private Long messageId = null;
    /**
     * disable_notification Boolean Optional Pass True, if it is not necessary to send a
     * notification to all chat members about the new pinned message. Notifications are always
     * disabled in channels.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;

    public PinChatMessage(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Long getMessageId() {
        return messageId;
    }

    public PinChatMessage setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public PinChatMessage setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    @Override
    public PinChatMessage setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public PinChatMessage setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
