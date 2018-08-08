package ru.ioleksiv.telegram.bot.core.controller.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class Loader {
    private static final Logger LOG = LoggerFactory.getLogger(Loader.class);
    private final ActionBuilder actionBuilder;

    public Loader(ActionBuilder actionBuilder) {
        this.actionBuilder = actionBuilder;
    }

    public List<Update> loadUpdates() {
        List<Update> updatesArray = actionBuilder.getUpdates()
                .send()
                .orElse(Collections.emptyList());

        LOG.trace("Process " + updatesArray.size() + " updates");

        if (!updatesArray.isEmpty()) {
            // change received updates state
            Update lastUpdate = Collections.max(updatesArray, Comparator.comparingLong(Update::getUpdateId));
            actionBuilder.getUpdates()
                    .setOffset(lastUpdate.getUpdateId().intValue() + 1)
                    .send();
        }

        return updatesArray;
    }

}
