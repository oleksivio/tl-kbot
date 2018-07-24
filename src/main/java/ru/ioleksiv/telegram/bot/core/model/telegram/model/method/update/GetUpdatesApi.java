package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IServerApi;

public class GetUpdatesApi implements IServerApi {
    private static final String METHOD = "getUpdates";
    @JsonProperty("offset")
    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String getMethod() {
        return METHOD;
    }

}
