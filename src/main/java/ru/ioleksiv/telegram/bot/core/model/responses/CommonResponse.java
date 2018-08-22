package ru.ioleksiv.telegram.bot.core.model.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonResponse<T> {
    @JsonProperty("ok")
    private boolean status = false;
    @JsonProperty("result")
    private T telegramObject = null;

    public T get() {
        return telegramObject;
    }

    public void set(T telegramObject) {
        this.telegramObject = telegramObject;
    }

    @JsonProperty("ok")
    public boolean isStatus() {
        return status;
    }

    @JsonProperty("ok")
    public void setStatus(boolean ok) {
        status = ok;
    }

}
