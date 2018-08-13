package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

public abstract class MessageAction extends ChatAction<Message> {
    private static final Logger LOG = LoggerFactory.getLogger(MessageAction.class);
    /**
     * reply_markup InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply Optional
     * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty("reply_markup")
    private IKeyboard replyMarkup = null;
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a notification with
     * no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long replyToMessageId = null;

    public MessageAction(String method, ActionNetworker actionNetworker) {
        super(method, actionNetworker);
    }

    protected void pSetReplyToMessageId(Long replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    protected void pSetReplyMarkup(IKeyboard replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    protected void pSetDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
    }

    public IKeyboard getReplyMarkup() {
        return replyMarkup;
    }

    public abstract MessageAction setReplyMarkup(IKeyboard replyMarkup);

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public abstract MessageAction setDisableNotification(Boolean disableNotification);

    public Long getReplyToMessageId() {
        return replyToMessageId;
    }

    public abstract MessageAction setReplyToMessageId(Long replyToMessageId);

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
