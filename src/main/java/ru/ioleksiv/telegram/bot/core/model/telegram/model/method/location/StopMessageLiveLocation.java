package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * https://core.telegram.org/bots/api#stopmessagelivelocation
 */
public class StopMessageLiveLocation extends ChatAction<Message> {
    private static final String METHOD = "stopMessageLiveLocation";

    /**
     * message_id	Integer	Optional	Required if inline_message_id is not specified. Identifier of the sent message
     */
    @JsonProperty("message_id")
    private Long messageId;
    /**
     * inline_message_id	String	Optional	Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private Long inlineMessageId = null;
    /**
     * reply_markup	InlineKeyboardMarkup	Optional	A JSON-serialized object for a new inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup inlineKeyboardMarkup = null;

    public StopMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
    }

    public Long getMessageId() {
        return messageId;
    }

    public StopMessageLiveLocation setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public Long getInlineMessageId() {
        return inlineMessageId;
    }

    public StopMessageLiveLocation setInlineMessageId(Long inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public InlineKeyboardMarkup getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    public StopMessageLiveLocation setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = inlineKeyboardMarkup;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
