package ru.ioleksiv.telegram.bot.api.model.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.MessageAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendvenue">sendVenue</a>
 */
public class SendVenue extends MessageAction {
    private static final String METHOD = "sendVenue";

    /**
     * latitude	Float number Latitude of the venue
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number Longitude of the venue
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

    public SendVenue(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getFoursquareType() {
        return foursquareType;
    }

    public SendVenue setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public SendVenue setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public SendVenue setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SendVenue setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public SendVenue setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public SendVenue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    @Override
    public SendVenue setReplyMarkup(IKeyboard replyMarkup) {
        pSetReplyMarkup(replyMarkup);
        return this;
    }

    @Override
    public SendVenue setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    public SendVenue setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVenue setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendVenue setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
