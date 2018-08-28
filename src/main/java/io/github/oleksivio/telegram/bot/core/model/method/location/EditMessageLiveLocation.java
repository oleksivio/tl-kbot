package io.github.oleksivio.telegram.bot.core.model.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.EditAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagelivelocation">editMessageLiveLocation</a>
 */
public abstract class EditMessageLiveLocation<RES> extends EditAction<RES> {
    private static final String METHOD = "editMessageLiveLocation";

    /**
     * latitude Float number Latitude of new location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude Float number Longitude of new location
     */
    @JsonProperty("longitude")
    private Double longitude = null;

    public EditMessageLiveLocation(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
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
    public EditMessageLiveLocation<RES> setInlineMessageId(String inlineMessageId) {
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

    @Override
    public EditMessageLiveLocation<RES> setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
