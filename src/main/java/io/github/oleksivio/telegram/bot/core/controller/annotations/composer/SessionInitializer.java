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

    private final HandlerCreator handlerCreator;
    private final SessionProcessor sessionProcessor;

    public SessionInitializer(HandlerCreator handlerCreator, SessionProcessor sessionProcessor) {
        this.handlerCreator = handlerCreator;
        this.sessionProcessor = sessionProcessor;
    }

    public void init(Class<?> objClz, Object obj) {
        Handler initialHandler = null;
        Handler cancelHandler = null;

        Map<Integer, List<Handler>> orderMap = new HashMap<>();

        SessionType sessionType = objClz.getDeclaredAnnotation(Session.class).type();

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
            else if (method.isAnnotationPresent(Session.Order.class)) {
                Session.Order orderAnnotation = method.getDeclaredAnnotation(Session.Order.class);
                int order = orderAnnotation.value();
                List<Handler> handlers = orderMap.computeIfAbsent(order, i -> new ArrayList<>());
                handlers.add(handler);
            }

        }

        check(initialHandler, cancelHandler, orderMap);

        OrderManager orderManager = new OrderManager(orderMap);

        SessionManager sessionManager = createSession(sessionType,
                                                      orderManager,
                                                      initialHandler,
                                                      cancelHandler);
        sessionProcessor.add(sessionManager);
    }

    private static void check(Handler initialHandler,
                              Handler cancelHandler,
                              Map<Integer, List<Handler>> orderMap) throws IllegalArgumentException {
        if (orderMap == null || orderMap.isEmpty()) {
            throw new IllegalArgumentException("Invalid session state. " +
                                                       "Can't be less than one" +
                                                       " Session Order method's");
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
