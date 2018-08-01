package ru.ioleksiv.telegram.bot.core.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
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
