package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.DefaultStateless;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.Session;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.Stateless;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.After;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.Before;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.update.Default;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.UpdateHandler;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.StatelessProcessor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class AnnotationProcessor {

    @NotNull
    private final MainProcessor mainProcessor;

    public AnnotationProcessor(@NotNull MainProcessor mainProcessor) {
        this.mainProcessor = mainProcessor;
    }

    public void add(@NotNull Object obj) {

        Class<?> objClz = obj.getClass();

        if (objClz.isAnnotationPresent(Session.class)) {
            TelegramProcessor sessionProcessor = createSessionHandler(objClz, obj);
            mainProcessor.addSession(sessionProcessor);
        }
        else if (objClz.isAnnotationPresent(Stateless.class)) {
            List<TelegramProcessor> statelessProcessor = createStatelessHandler(objClz, obj);
            mainProcessor.addStateless(statelessProcessor);
        }
        else if (objClz.isAnnotationPresent(DefaultStateless.class)) {
            TelegramProcessor defaultProcessor = getDefaultProcessor(objClz, obj);
            mainProcessor.setDefault(defaultProcessor);
        }
    }

    @NotNull
    private static TelegramProcessor createSessionHandler(@NotNull Class clazz,
                                                          @NotNull Object obj) {

        Handler initialHandler = null;
        Handler cancelHandler = null;

        SessionProcessor sessionProcessor = new SessionProcessor();

        for (Method method : clazz.getDeclaredMethods()) {

            Optional<Handler> optionalHandler = HandlerFactory.create(obj, method);
            if (!optionalHandler.isPresent()) {
                continue;
            }
            Handler handler = optionalHandler.get();

            if (method.isAnnotationPresent(Session.Initial.class)) {
                initialHandler = handler;
            }
            else if (method.isAnnotationPresent(Session.Cancel.class)) {
                cancelHandler = handler;
            }
            else if (method.isAnnotationPresent(Session.Order.class)) {
                Session.Order orderAnnotation = method.getDeclaredAnnotation(Session.Order.class);
                int order = orderAnnotation.value();
                if (order <= 0) {
                    throw new IllegalStateException("Order value can't be less than one");
                }
                sessionProcessor.addOrderHandler(order, handler);

            }

        }

        sessionProcessor.setInitialHandler(initialHandler);
        sessionProcessor.setCancelHandler(cancelHandler);

        // throws exception if not valid
        sessionProcessor.check();

        return sessionProcessor;
    }

    @NotNull
    private static List<TelegramProcessor> createStatelessHandler(@NotNull Class clazz,
                                                                  @NotNull Object obj) {
        Handler beforeHandler = null;
        Handler afterHandler = null;
        Collection<Handler> simpleHandlerList = new ArrayList<>();

        for (Method method : clazz.getDeclaredMethods()) {
            Optional<Handler> optionalHandler = HandlerFactory.create(obj, method);
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

        List<TelegramProcessor> processors = new ArrayList<>();
        for (Handler handler : simpleHandlerList) {
            processors.add(new StatelessProcessor(beforeHandler, afterHandler, handler));
        }
        return processors;

    }

    @NotNull
    private static TelegramProcessor getDefaultProcessor(@NotNull Class<?> clazz,
                                                         @NotNull Object obj) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Default.class)) {
                UpdateHandler updateHandler = new UpdateHandler(obj, method);
                return updateHandler::invoke;
            }
        }

        return update -> HandlerResult.noAction();
    }
}