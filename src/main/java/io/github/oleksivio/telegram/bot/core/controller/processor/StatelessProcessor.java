package io.github.oleksivio.telegram.bot.core.controller.processor;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class StatelessProcessor {

    private final Collection<Handler> handlers = new ArrayList<>();

    public void add(Handler handler) {
        handlers.add(handler);
    }

    void receive(Update update) {
        handlers.stream()
                .filter(handler -> handler.hasSubscription(update))
                .forEach(handler -> handler.run(update));

    }

}
