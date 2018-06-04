package ru.ioleksiv.telegram.bot.api.telegram.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonResponse<T> {
    @JsonProperty("result")
    private T mTelegramObject = null;
    @JsonProperty("ok")
    private boolean mStatus = false;

    public T get() {
        return mTelegramObject;
    }

    public void set(T telegramObject) {
        mTelegramObject = telegramObject;
    }

    @JsonProperty("ok")
    public boolean isStatus() {
        return mStatus;
    }

    @JsonProperty("ok")
    public void setStatus(boolean ok) {
        mStatus = ok;
    }

}
