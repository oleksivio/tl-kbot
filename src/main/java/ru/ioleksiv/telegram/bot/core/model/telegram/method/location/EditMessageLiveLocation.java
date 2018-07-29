package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.InlineKeyboardMarkup;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagelivelocation">editMessageLiveLocation</a>
 */
public abstract class EditMessageLiveLocation<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageLiveLocation";

    /**
     * latitude	Float number Latitude of new location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number Longitude of new location
     */
    @JsonProperty("longitude")
    private Double longitude = null;

    EditMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
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

    @Override
    public EditMessageLiveLocation<RES> setMessageId(Long messageId) {
        pSetMessageId(messageId);
        return this;
    }

    @Override
    public EditMessageLiveLocation<RES> setInlineMessageId(Long inlineMessageId) {
        pSetInlineMessageId(inlineMessageId);
        return this;
    }

    @Override
    public EditMessageLiveLocation<RES> setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        pSetInlineKeyboardMarkup(inlineKeyboardMarkup);
        return this;
    }

    @Override
    public EditMessageLiveLocation<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
