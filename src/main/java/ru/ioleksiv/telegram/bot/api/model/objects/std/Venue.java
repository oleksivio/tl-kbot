package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#venue">Venue</a>
 */
public class Venue implements ITelegram {
    /**
     * To setup filter:
     *
     * @see LocationFilter location
     * location Location Venue location
     */
    @JsonProperty("location")
    private Location location = null;
    /**
     * To setup filter:
     *
     * @see StringFilter title
     * title String Name of the venue
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * To setup filter:
     *
     * @see StringFilter address
     * address String Address of the venue
     */
    @JsonProperty("address")
    private String address = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter foursquareId
     * foursquare_id String Optional. Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String foursquareId = null;
    /**
     * To setup filter:
     *
     * @see StringFilter foursquareType
     * foursquare_type String Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    private String foursquareType = null;

    public String getFoursquareType() {
        return foursquareType;
    }

    public Venue setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }
}
