package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

public class MessageAction extends ChatAction<Message> {
    private static final Logger LOG = LoggerFactory.getLogger(MessageAction.class);
    /**
     * reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty("reply_markup")
    private IKeyboard replyMarkup = null;
    /**
     * disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long replyToMessageId = null;

    public MessageAction(String method, Networker networker) {
        super(method, networker);
    }

    public IKeyboard getReplyMarkup() {
        return replyMarkup;
    }

    public MessageAction setReplyMarkup(IKeyboard replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public MessageAction setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Long getReplyToMessageId() {
        return replyToMessageId;
    }

    public MessageAction setReplyToMessageId(Long replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
