package io.github.oleksivio.telegram.bot.core.controller.processor;

import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.api.model.objects.Update;

import java.util.ArrayList;
import java.util.Collection;

public class StatelessProcessor {

    private final Collection<Handler> handlers = new ArrayList<>();

    public StatelessProcessor(Collection<Handler> handlers) {
        this.handlers.addAll(handlers);
    }

    void receive(Update update) {
        handlers.stream()
                .filter(handler -> handler.hasSubscription(update))
                .forEach(handler -> handler.run(update));

    }

}
