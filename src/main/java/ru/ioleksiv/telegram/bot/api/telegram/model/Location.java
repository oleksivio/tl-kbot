package ru.ioleksiv.telegram.bot.api.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.ITelegram;

public class Location implements ITelegram {
    @JsonProperty("latitude")
    private float mLatitude = 0;
    @JsonProperty("longitude")
    private float mLongitude = 0;

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(float longitude) {
        mLongitude = longitude;
    }

}
