package ru.ioleksiv.telegram.bot.core.model.objects.inline.messagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inputvenuemessagecontent>InputVenueMessageContent</a>
 */
public class InputVenueMessageContent implements InputMessageContent {
    /**
     * latitude	Float	Latitude of the venue in degrees
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float	Longitude of the venue in degrees
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * title	String Name of the venue
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * address	String Address of the venue
     */
    @JsonProperty("address")
    private String address = null;
    /**
     * foursquare_id	String	Optional	Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String foursquareId = null;
    /**
     * foursquare_type	String	Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    private String foursquareType = null;

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

    public String getFoursquareType() {
        return foursquareType;
    }

    public void setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
    }
}
