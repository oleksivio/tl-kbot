package io.github.oleksivio.telegram.bot.api.model.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.MessageAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendlocation">sendLocation</a>
 */
public class SendLocation extends MessageAction {
    private static final String METHOD = "sendLocation";

    /**
     * latitude Float number Latitude of the location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude Float number Longitude of the location
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * live_period Integer Optional Period in seconds for which the location will be
     * updated (see Live Locations, should be between 60 and 86400
     */
    @JsonProperty("live_period")
    private Integer livePeriod = null;

    public SendLocation(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);

    }

    public Double getLatitude() {
        return latitude;
    }

    public SendLocation setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public SendLocation setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Integer getLivePeriod() {
        return livePeriod;
    }

    public SendLocation setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    @Override
    public SendLocation setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    public SendLocation setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendLocation setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendLocation setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendLocation setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}

