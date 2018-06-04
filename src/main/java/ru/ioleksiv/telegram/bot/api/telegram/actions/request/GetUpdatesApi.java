package ru.ioleksiv.telegram.bot.api.telegram.actions.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.ioleksiv.telegram.bot.api.telegram.actions.IApi;

public class GetUpdatesApi implements IApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetUpdatesApi.class);
    private static final String METHOD = "getUpdates";
    @JsonProperty("offset")
    private Integer mOffset = null;

    public Integer getOffset() {
        return mOffset;
    }

    public void setOffset(int offset) {
        mOffset = offset;
    }

    @Override
    public String getMethod() {
        return METHOD;
    }

}
