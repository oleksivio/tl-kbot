package ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultvenue>InlineQueryResultVenue</a>
 */
public class InlineQueryResultVenue extends TitledInlineResult {
    private static final String TYPE = "venue";
    /**
     * latitude Float number Latitude of the venue
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude Float number Longitude of the venue
     */
    @JsonProperty("longitude")
    private Double longitude = null;
    /**
     * address String Address of the venue
     */
    @JsonProperty("address")
    private String address = null;
    /**
     * foursquare_id String Optional Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String foursquareId = null;
    /**
     * foursquare_type String Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    private String foursquareType = null;
    /**
     * thumb_url String Optional. URL of the thumbnail (jpeg only) for the file
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;
    /**
     * thumb_width Integer Optional. Thumbnail width
     */
    @JsonProperty("thumb_width")
    private Integer thumbWidth = null;
    /**
     * thumb_height Integer Optional. Thumbnail height
     */
    @JsonProperty("thumb_height")
    private Integer thumbHeight = null;

    InlineQueryResultVenue() {
        super(TYPE);
    }

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

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }
}
