package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.TelegramProcessor;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class MainProcessor implements TelegramProcessor {
    @NotNull
    private final Collection<StatelessProcessor> statelessProcessors = new ArrayList<>();
    @NotNull
    private final Collection<SessionProcessor> sessionProcessors = new ArrayList<>();

    @Override
    public void receive(@Nullable Update update) {

        for (SessionProcessor handler : sessionProcessors) {
            HandlerResult handlerResult = handler.receive(update);
            if (!handlerResult.isPassed()) {
                return;
            }
        }

        for (StatelessProcessor handler : statelessProcessors) {
            HandlerResult handlerResult = handler.receive(update);
            if (!handlerResult.isPassed()) {
                return;
            }
        }

    }

    public void addStateless(Collection<StatelessProcessor> processor) {
        statelessProcessors.addAll(processor);
    }

    public void addSession(SessionProcessor processor) {
        sessionProcessors.add(processor);
    }

}
