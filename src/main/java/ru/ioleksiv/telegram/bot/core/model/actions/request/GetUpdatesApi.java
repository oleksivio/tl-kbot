package ru.ioleksiv.telegram.bot.core.model.actions.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.actions.IServerApi;

public class GetUpdatesApi implements IServerApi {
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
