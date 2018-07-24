package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.DefaultStateless;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.Session;
import ru.ioleksiv.telegram.bot.core.api.annotations.behavior.Stateless;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.After;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.Before;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.update.DefaultHandler;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.CollectionHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.HandlerFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.AbstractInvokeHandler;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.UpdateHandler;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.StatelessProcessor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnnotationProcessor {

    private final MainProcessor mainProcessor;

    @Autowired
    public AnnotationProcessor(MainProcessor mainProcessor) {
        this.mainProcessor = mainProcessor;
    }

    public void add(Object obj) {

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

    @Nullable
    private static TelegramProcessor createSessionHandler(Class clazz, Object obj) {

        CollectionHandler initialHandler = new CollectionHandler();
        CollectionHandler cancelHandler = new CollectionHandler();
        SessionProcessor sessionProcessor = new SessionProcessor(initialHandler, cancelHandler);

        for (Method method : clazz.getDeclaredMethods()) {

            AbstractInvokeHandler handler = HandlerFactory.create(obj, method);

            if (method.isAnnotationPresent(Session.Initial.class)) {
                initialHandler.add(handler);
            }
            else if (method.isAnnotationPresent(Session.Cancel.class)) {
                cancelHandler.add(handler);
            }
            else if (method.isAnnotationPresent(Session.Order.class)) {
                Session.Order orderAnnotation = method.getDeclaredAnnotation(Session.Order.class);
                int order = orderAnnotation.value();
                if (order <= 0) {
                    throw new IllegalStateException("Order value can't be less than one");
                }
                if (handler != null) {
                    sessionProcessor.addOrderHandler(order, handler);
                }
            }

        }

        if (initialHandler.isEmpty()) {
            throw new IllegalArgumentException("Invalid session handler state. Can't be less than one" +
                                                       " @Session.Initial annotated method's");
        }

        if (cancelHandler.isEmpty()) {
            throw new IllegalArgumentException("Invalid session handler state. Can't be less than one" +
                                                       " @Session.Cancel annotated method's");
        }

        return sessionProcessor;
    }

    @NotNull
    private static List<TelegramProcessor> createStatelessHandler(Class clazz, Object obj) {
        IHandler beforeHandler = null;
        IHandler afterHander = null;
        Collection<IHandler> simpleHandlerList = new ArrayList<>();

        for (Method method : clazz.getDeclaredMethods()) {
            AbstractInvokeHandler handler = HandlerFactory.create(obj, method);
            if (handler == null) {
                continue;
            }

            if (method.isAnnotationPresent(Before.class)) {
                beforeHandler = handler;
            }
            else if (method.isAnnotationPresent(After.class)) {
                afterHander = handler;
            }
            else {
                simpleHandlerList.add(handler);
            }

        }

        List<TelegramProcessor> processors = new ArrayList<>();
        for (IHandler handler : simpleHandlerList) {
            processors.add(new StatelessProcessor(beforeHandler, afterHander, handler));
        }
        return processors;

    }

    @NotNull
    public static TelegramProcessor getDefaultProcessor(Class<?> clazz, Object obj) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(DefaultHandler.class)) {
                UpdateHandler updateHandler = new UpdateHandler(obj, method);
                return updateHandler::invoke;
            }
        }

        return update -> HandlerResult.noAction();
    }
}