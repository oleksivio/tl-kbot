package ru.ioleksiv.telegram.bot.core.model.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UpdatesArray implements ITelegram, Iterable<Update> {
    @JsonProperty("result")
    private final List<Update> mUpdates = new ArrayList<>();
    @JsonProperty("ok")
    private String mOk = "";

    @NotNull
    @Override
    public Iterator<Update> iterator() {
        return mUpdates.iterator();
    }

    public String getOk() {
        return mOk;
    }

    public void setOk(String ok) {
        mOk = ok;
    }

    public List<Update> getUpdates() {
        return Collections.unmodifiableList(mUpdates);
    }

    public void setUpdates(Collection<Update> updateList) {
        mUpdates.addAll(updateList);
    }

}
