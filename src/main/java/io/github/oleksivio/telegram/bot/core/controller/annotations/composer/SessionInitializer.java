package io.github.oleksivio.telegram.bot.core.controller.annotations.composer;

import io.github.oleksivio.telegram.bot.api.annotations.behavior.Session;
import io.github.oleksivio.telegram.bot.api.model.annotation.SessionType;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.ChatSession;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.OrderManager;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.SessionManager;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.SessionProcessor;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.UserSession;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class SessionInitializer {

    private static final Class<Session.Order> SESSION_ORDER_CLASS = Session.Order.class;
    private static final Class<Session.Error> SESSION_ERROR_CLASS = Session.Error.class;
    private final HandlerCreator handlerCreator;
    private final SessionProcessor sessionProcessor;

    public SessionInitializer(HandlerCreator handlerCreator, SessionProcessor sessionProcessor) {
        this.handlerCreator = handlerCreator;
        this.sessionProcessor = sessionProcessor;
    }

    public void init(Class<?> objClz, Object obj) {
        Handler initialHandler = null;
        Handler cancelHandler = null;

        Map<Integer, List<Handler>> handlerMap = new HashMap<>();
        Map<Integer, Handler> errorMap = new HashMap<>();

        SessionType sessionType = objClz.getDeclaredAnnotation(Session.class).value();

        for (Method method : objClz.getDeclaredMethods()) {

            Optional<Handler> optionalHandler = handlerCreator.create(obj, method);
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
            else if (method.isAnnotationPresent(SESSION_ORDER_CLASS)) {
                int order = method.getDeclaredAnnotation(SESSION_ORDER_CLASS).value();
                List<Handler> handlers = handlerMap.computeIfAbsent(order, i -> new ArrayList<>());
                handlers.add(handler);
            }
            else if (method.isAnnotationPresent(SESSION_ERROR_CLASS)) {
                int errorOrder = method.getDeclaredAnnotation(SESSION_ERROR_CLASS).value();

                check(errorMap, errorOrder);

                errorMap.put(errorOrder, handler);
            }

        }

        check(initialHandler, cancelHandler, handlerMap, errorMap);

        OrderManager orderManager = new OrderManager(handlerMap, errorMap);

        SessionManager sessionManager = createSession(sessionType,
                                                      orderManager,
                                                      initialHandler,
                                                      cancelHandler);
        sessionProcessor.add(sessionManager);
    }

    private static void check(Map<Integer, Handler> errorMap, int errorOrder) {
        if (errorMap.containsKey(errorOrder)) {
            throw new IllegalArgumentException("Can't be more than one error receivers");
        }
    }

    private static void check(Handler initialHandler,
                              Handler cancelHandler,
                              Map<Integer, List<Handler>> orderMap,
                              Map<Integer, Handler> errorMap) throws IllegalArgumentException {
        if (orderMap == null || orderMap.isEmpty()) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " Session Order method's");
        }

        for (Integer index : errorMap.keySet()) {
            if (!orderMap.keySet().contains(index)) {
                throw new IllegalArgumentException("Invalid session error state. " +
                                                           "Can't be Session Error and Session Order" +
                                                           " must have same index");
            }
        }

        if (initialHandler == null) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " Session Initial method's");
        }

        if (cancelHandler == null) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " Session Cancel method's");
        }
    }

    private static SessionManager createSession(SessionType type,
                                                OrderManager orderManager,
                                                Handler initialHandler,
                                                Handler cancelHandler) {
        switch (type) {
            case USER: {
                return new UserSession(orderManager, initialHandler, cancelHandler);

            }
            case CHAT: {
                return new ChatSession(orderManager, initialHandler, cancelHandler);
            }
        }
        throw new IllegalArgumentException("Invalid session type. " + type);

    }
}
