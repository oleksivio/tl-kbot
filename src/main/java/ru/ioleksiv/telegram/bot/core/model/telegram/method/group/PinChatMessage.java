package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#pinchatmessage>pinChatMessage</a>
 */
public class PinChatMessage  extends ChatAction<Boolean > {
    private static final String METHOD = "pinChatMessage";
    /**
     * message_id	Integer	Yes	Identifier of a message to pin
     */
    @JsonProperty("message_id")
    private Long messageId = null;
    /**
     * disable_notification	Boolean	Optional	Pass True, if it is not necessary to send a
     * notification to all chat members about the new pinned message. Notifications are always
     * disabled in channels.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;

    protected PinChatMessage(Networker networker) {
        super(METHOD, networker);
    }

    public Long getMessageId() {
        return messageId;
    }

    public PinChatMessage  setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public PinChatMessage  setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }
}
