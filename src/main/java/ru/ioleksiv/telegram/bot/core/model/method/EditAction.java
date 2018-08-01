package ru.ioleksiv.telegram.bot.core.model.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

public abstract class EditAction<RES> extends ChatAction<RES> {
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
    private String inlineMessageId = null;

    protected EditAction(String method, Networker networker) {
        super(method, networker);
    }

    protected void pSetMessageId(Long messageId) {
        this.messageId = messageId;
    }

    protected void pSetInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    protected void pSetInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = inlineKeyboardMarkup;
    }

    public Long getMessageId() {
        return messageId;
    }

    public abstract EditAction<RES> setMessageId(Long messageId);

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public abstract EditAction<RES> setInlineMessageId(String inlineMessageId);

    public InlineKeyboardMarkup getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    public abstract EditAction<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup);
}
