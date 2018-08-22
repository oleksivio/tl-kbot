package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.controller.TelegramProcessor;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.result.HandlerResult;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class MainProcessor implements TelegramProcessor {

    private final Collection<StatelessProcessor> statelessProcessors = new ArrayList<>();

    private final Collection<SessionProcessor> sessionProcessors = new ArrayList<>();

    @Override
    public void receive(Update update) {
        if (update == null) {
            return;
        }

        for (SessionProcessor processor : sessionProcessors) {
            HandlerResult handlerResult = processor.receive(update);
            if (!handlerResult.isPassed()) {
                return;
            }
        }

        for (StatelessProcessor processor : statelessProcessors) {
            HandlerResult handlerResult = processor.receive(update);
            if (!handlerResult.isPassed()) {
                return;
            }
        }

    }

    public void addStateless(StatelessProcessor processor) {
        statelessProcessors.add(processor);
    }

    public void addSession(SessionProcessor processor) {
        sessionProcessors.add(processor);
    }

}
