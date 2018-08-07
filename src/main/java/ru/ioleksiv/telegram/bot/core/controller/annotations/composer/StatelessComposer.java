package ru.ioleksiv.telegram.bot.core.controller.annotations.composer;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.After;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.Before;
import ru.ioleksiv.telegram.bot.core.controller.annotations.HandlerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.processor.StatelessProcessor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Controller
public class StatelessComposer {
    private final HandlerFactory handlerFactory;

    public StatelessComposer(HandlerFactory handlerFactory) {
        this.handlerFactory = handlerFactory;
    }

    public List<StatelessProcessor> create(Class<?> objClz, Object obj) {
        Handler beforeHandler = null;
        Handler afterHandler = null;
        Collection<Handler> simpleHandlerList = new ArrayList<>();

        for (Method method : objClz.getDeclaredMethods()) {
            Optional<Handler> optionalHandler = handlerFactory.create(obj, method);
            if (!optionalHandler.isPresent()) {
                continue;
            }
            Handler handler = optionalHandler.get();

            if (method.isAnnotationPresent(Before.class)) {
                beforeHandler = handler;
            }
            else if (method.isAnnotationPresent(After.class)) {
                afterHandler = handler;
            }
            else {
                simpleHandlerList.add(handler);
            }

        }

        List<StatelessProcessor> processors = new ArrayList<>();
        for (Handler handler : simpleHandlerList) {
            processors.add(new StatelessProcessor(beforeHandler, afterHandler, handler));
        }
        return processors;
    }
}
