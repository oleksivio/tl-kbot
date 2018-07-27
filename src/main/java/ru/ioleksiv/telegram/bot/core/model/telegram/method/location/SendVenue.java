package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.MessageAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.IKeyboard;

/**
 * https://core.telegram.org/bots/api#sendvenue
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

    public SendVenue(Networker networker) {
        super(METHOD, networker);
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
    protected SendVenue setDisableNotification(Boolean disableNotification) {
        pSetDisableNotification(disableNotification);
        return this;
    }

    @Override
    protected SendVenue setReplyToMessageId(Long replyToMessageId) {
        pSetReplyToMessageId(replyToMessageId);
        return this;
    }

    @Override
    public SendVenue setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
