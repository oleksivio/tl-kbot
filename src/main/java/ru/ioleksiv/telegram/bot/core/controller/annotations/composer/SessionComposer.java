package ru.ioleksiv.telegram.bot.core.controller.annotations.composer;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.UserSession;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionOrderManager;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
public class SessionComposer {

    private final HandlerComposer handlerComposer;

    public SessionComposer(HandlerComposer handlerComposer) {
        this.handlerComposer = handlerComposer;
    }

    public SessionProcessor create(Class<?> objClz, Object obj) {
        Handler initialHandler = null;
        Handler cancelHandler = null;

        Map<Integer, Handler> orderMap = new HashMap<>();

        for (Method method : objClz.getDeclaredMethods()) {

            Optional<Handler> optionalHandler = handlerComposer.create(obj, method);
            if (!optionalHandler.isPresent()) {
                continue;
            }
            Handler handler = optionalHandler.get();

            if (method.isAnnotationPresent(UserSession.Initial.class)) {
                initialHandler = handler;
            }
            else if (method.isAnnotationPresent(UserSession.Cancel.class)) {
                cancelHandler = handler;
            }
            else if (method.isAnnotationPresent(UserSession.Order.class)) {
                UserSession.Order orderAnnotation = method.getDeclaredAnnotation(UserSession.Order.class);
                int order = orderAnnotation.value();
                orderMap.put(order, handler);
            }

        }

        check(initialHandler, cancelHandler, orderMap);

        SessionOrderManager orderManager = new SessionOrderManager(orderMap);
        return new SessionProcessor(orderManager, initialHandler, cancelHandler);
    }

    public static void check(Handler initialHandler,
                             Handler cancelHandler,
                             Map<Integer, Handler> orderMap) throws IllegalArgumentException {
        if (orderMap == null || orderMap.isEmpty()) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " UserSession Order method's");
        }

        if (initialHandler == null) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " UserSession Initial method's");
        }

        if (cancelHandler == null) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " UserSession Cancel method's");
        }
    }
}
