package ru.ioleksiv.telegram.bot.core.controller.annotations.composer;

import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.Session;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.HandlerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;

import java.lang.reflect.Method;
import java.util.Optional;

public class SessionComposer {

    private final HandlerFactory handlerFactory;

    public SessionComposer(HandlerFactory handlerFactory) {
        this.handlerFactory = handlerFactory;
    }

    public SessionProcessor create(Class<?> objClz, Object obj) {
        Handler initialHandler = null;
        Handler cancelHandler = null;

        SessionProcessor sessionProcessor = new SessionProcessor();

        for (Method method : objClz.getDeclaredMethods()) {

            Optional<Handler> optionalHandler = handlerFactory.create(obj, method);
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
}
