package io.github.oleksivio.telegram.bot.core.controller.annotations.composer;

import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.core.controller.processor.StatelessProcessor;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Controller
public class StatelessInitializer {
    private final HandlerCreator handlerCreator;
    private final StatelessProcessor statelessProcessor;

    public StatelessInitializer(HandlerCreator handlerCreator, StatelessProcessor statelessProcessor) {
        this.handlerCreator = handlerCreator;
        this.statelessProcessor = statelessProcessor;
    }

    public void init(Class<?> objClz, Object obj) {
        Collection<Handler> simpleHandlerList = new ArrayList<>();

        for (Method method : objClz.getDeclaredMethods()) {
            Optional<Handler> optionalHandler = handlerCreator.create(obj, method);
            if (!optionalHandler.isPresent()) {
                continue;
            }
            simpleHandlerList.add(optionalHandler.get());
        }

        for (Handler handler : simpleHandlerList) {
            statelessProcessor.add(handler);
        }
    }
}
