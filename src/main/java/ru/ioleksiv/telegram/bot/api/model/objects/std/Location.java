package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

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
    private Float longitude = null;
    /**
     * To setup filter:
     *
     * @see DoubleFilter latitude
     * latitude	Float	Latitude as defined by sender
     */
    @JsonProperty("latitude")
    private Float latitude = null;

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}
