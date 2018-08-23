package ru.ioleksiv.telegram.bot.core.controller.processor;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.util.ArrayList;
import java.util.Collection;

public class StatelessProcessor {

    private final Collection<Handler> handlers = new ArrayList<>();

    public StatelessProcessor(Collection<Handler> handlers) {
        this.handlers.addAll(handlers);
    }

    HandlerResult receive(Update update) {
        for (Handler handler : handlers) {

            if (!handler.hasSubscription(update)) {
                continue;
            }

            HandlerResult resultActionList = handler.run(update);

            if (!resultActionList.isPassed()) {
                return resultActionList;
            }
        }

        return HandlerResult.pass();
    }

}
