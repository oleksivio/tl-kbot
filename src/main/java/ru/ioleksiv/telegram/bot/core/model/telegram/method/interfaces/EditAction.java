package ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.InlineKeyboardMarkup;

public abstract class EditAction<RES > extends ChatAction<RES > {

    /**
     * reply_markup	InlineKeyboardMarkup	Optional	A JSON-serialized object for a new inline
     * keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup inlineKeyboardMarkup = null;
    /**
     * message_id	Integer	Optional	Required if inline_message_id is not specified. Identifier
     * of the sent message
     */
    @JsonProperty("message_id")
    private Long messageId = null;
    /**
     * inline_message_id	String	Optional	Required if chat_id and message_id are not specified.
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private Long inlineMessageId = null;

    protected EditAction(String method, Networker networker) {
        super(method, networker);
    }

    public Long getMessageId() {
        return messageId;
    }

    public EditAction<RES > setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public Long getInlineMessageId() {
        return inlineMessageId;
    }

    public EditAction<RES > setInlineMessageId(Long inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public InlineKeyboardMarkup getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    public EditAction<RES > setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = inlineKeyboardMarkup;
        return this;
    }
}
