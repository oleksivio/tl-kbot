package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.MessageAction;

/**
 * @link https://core.telegram.org/bots/api#sendlocation
 */
public class SendLocation extends MessageAction {
    private static final String METHOD = "sendLocation";

    /**
     * latitude	Float number	Yes	Latitude of the location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number	Yes	Longitude of the location
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * live_period	Integer	Optional	Period in seconds for which the location will be
     * updated (see Live Locations, should be between 60 and 86400
     */
    @JsonProperty("live_period")
    private Integer livePeriod = null;

    public SendLocation(Networker networker) {
        super(METHOD, networker);

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
}

