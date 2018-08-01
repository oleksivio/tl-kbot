package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.messagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inputlocationmessagecontent>InputLocationMessageContent</a>
 */
public class InputLocationMessageContent implements InputMessageContent {
    /**
     * latitude	Float number Latitude of the location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number Longitude of the location
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * live_period	Integer	Optional	Period in seconds for which the location will be
     * updated (see Live Locations, should be between 60 and 86400
     */
    @JsonProperty("live_period")
    private Integer livePeriod = null;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getLivePeriod() {
        return livePeriod;
    }

    public void setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
    }
}
