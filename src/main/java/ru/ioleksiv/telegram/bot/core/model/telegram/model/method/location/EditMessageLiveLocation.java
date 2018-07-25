package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @link https://core.telegram.org/bots/api#editmessagelivelocation
 */
public class EditMessageLiveLocation extends ChatAction<Message> {
    private static final String METHOD = "editMessageLiveLocation";

    /**
     * message_id	Integer	Optional	Required if inline_message_id is not specified. Identifier
     * of the sent message
     */
    @JsonProperty("message_id")
    private Long messageId;
    /**
     * inline_message_id	String	Optional	Required if chat_id and message_id are not specified.
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private Long inlineMessageId = null;
    /**
     * latitude	Float number	Yes	Latitude of new location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number	Yes	Longitude of new location
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * reply_markup	InlineKeyboardMarkup	Optional	A JSON-serialized object for a new inline
     * keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup inlineKeyboardMarkup = null;

    protected EditMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
    }

    public Long getMessageId() {
        return messageId;
    }

    public EditMessageLiveLocation setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public Long getInlineMessageId() {
        return inlineMessageId;
    }

    public EditMessageLiveLocation setInlineMessageId(Long inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public EditMessageLiveLocation setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public EditMessageLiveLocation setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public InlineKeyboardMarkup getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    public EditMessageLiveLocation setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = inlineKeyboardMarkup;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
