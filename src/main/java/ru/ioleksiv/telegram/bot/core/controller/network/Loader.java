package ru.ioleksiv.telegram.bot.core.controller.network;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.update.GetUpdatesApi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Loader {
    private static final Logger LOG = LoggerFactory.getLogger(Loader.class);
    private final Networker networker;

    public Loader(Networker networker) {
        this.networker = networker;
    }

    public List<Update> loadUpdates() {
        List<Update> updatesArray = getUpdateWithOffset(0);

        LOG.trace("Process " + updatesArray.size() + " updates");

        if (!updatesArray.isEmpty()) {
            // change received updates state
            Update lastUpdate = Collections.max(updatesArray, Comparator.comparingLong(Update::getUpdateId));
            getUpdateWithOffset(lastUpdate.getUpdateId().intValue() + 1);
        }

        return updatesArray;
    }

    @NotNull
    private List<Update> getUpdateWithOffset(int offset) {
        GetUpdatesApi request = new GetUpdatesApi(networker);
        request.setOffset(offset);

        List<Update> updates = request.run();

        return updates != null ? updates : Collections.emptyList();
    }

}
