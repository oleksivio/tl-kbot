package ru.ioleksiv.telegram.bot.core.controller.network;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.exceptions.NetworkerException;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.update.GetUpdatesApi;

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
        try {
            List<Update> updates = request.run();
            if (updates != null) {
                return updates;
            }
        }
        catch (NetworkerException e) {
            LOG.debug("Error when load new updates with offset " + offset + ':', e);
        }

        return Collections.emptyList();
    }

}
