package io.github.oleksivio.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#location">Location</a>
 */
public class Location implements ITelegram {
    /**
     * To setup filter:
     *
     * @see DoubleFilter longitude
     * longitude	Float	Longitude as defined by sender
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * To setup filter:
     *
     * @see DoubleFilter latitude
     * latitude	Float	Latitude as defined by sender
     */
    @JsonProperty("latitude")
    private Double latitude = null;

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

}
