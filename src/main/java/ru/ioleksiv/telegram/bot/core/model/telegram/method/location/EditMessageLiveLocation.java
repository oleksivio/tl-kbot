package ru.ioleksiv.telegram.bot.core.model.telegram.method.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;

/**
 * @link https://core.telegram.org/bots/api#editmessagelivelocation
 */
public abstract class EditMessageLiveLocation<RES > extends EditAction<RES > {
    private static final String METHOD = "editMessageLiveLocation";

    /**
     * latitude	Float number	Yes	Latitude of new location
     */
    @JsonProperty("latitude")
    private Double latitude = null;
    /**
     * longitude	Float number	Yes	Longitude of new location
     */
    @JsonProperty("longitude")
    private Double longitude = null;


    EditMessageLiveLocation(Networker networker) {
        super(METHOD, networker);
    }

    public Double getLatitude() {
        return latitude;
    }

    public EditMessageLiveLocation setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public EditMessageLiveLocation setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }



}
