package ru.ioleksiv.telegram.bot.api.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.ITelegram;

public class Chat implements ITelegram {
    @JsonProperty("id")
    private long mId = 0;

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

}
