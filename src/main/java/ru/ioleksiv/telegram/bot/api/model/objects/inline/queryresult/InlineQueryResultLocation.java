package ru.ioleksiv.telegram.bot.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultlocation>InlineQueryResultLocation</a>
 */
public class InlineQueryResultLocation extends TitledInlineResult {
    private static final String TYPE = "location";

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
    /**
     * thumb_url	String	Optional. URL of the thumbnail (jpeg only) for the file
     */
    @JsonProperty("thumb_url")
    private String thumbUrl = null;
    /**
     * thumb_width	Integer	Optional. Thumbnail width
     */
    @JsonProperty("thumb_width")
    private Integer thumbWidth = null;
    /**
     * thumb_height	Integer	Optional. Thumbnail height
     */
    @JsonProperty("thumb_height")
    private Integer thumbHeight = null;

    InlineQueryResultLocation() {
        super(TYPE);
    }
}
