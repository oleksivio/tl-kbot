package io.github.oleksivio.telegram.bot.core.controller.processor.session;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;

import java.util.List;
import java.util.Optional;

public abstract class SessionManager {
    private final OrderManager orderManager;
    private final Handler initialHandler;
    private final Handler cancelHandler;

    public SessionManager(OrderManager orderManager,
                          Handler initialHandler,
                          Handler cancelHandler) {
        this.orderManager = orderManager;
        this.initialHandler = initialHandler;
        this.cancelHandler = cancelHandler;
    }

    public HandlerResult init(Update update) {
        return getIdOptional(update)
                .filter(id -> initialHandler.hasSubscription(update))
                .map(id -> {

                    HandlerResult handlerResult = initialHandler.run(update);
                    if (handlerResult.hasSuccess()) {
                        orderManager.next(id);
                    }
                    return handlerResult;
                })
                .orElse(HandlerResult.pass());

    }

    protected abstract Optional<Long> getIdOptional(Update update);

    public HandlerResult receive(Update update) {

        Optional<Long> userFromIdOptional = getIdOptional(update);

        if (!userFromIdOptional.isPresent()) {
            return HandlerResult.pass();
        }

        long id = userFromIdOptional.get();

        if (cancelHandler.hasSubscription(update)) {
            orderManager.reset(id);
            return cancelHandler.run(update);
        }

        List<Handler> handlerList = orderManager.getCurrent(id);
        if (handlerList.isEmpty()) {
            orderManager.reset(id);
            return HandlerResult.pass();
        }

        for (Handler handler : handlerList) {
            if (handler.hasSubscription(update)) {
                HandlerResult handlerResult = handler.run(update);

                if (handlerResult.hasSuccess()) {
                    orderManager.next(id);
                    return handlerResult;
                }
                if (handlerResult.hasCancelSession()) {
                    orderManager.reset(id);
                    return handlerResult;
                }

                return HandlerResult.error();
            }
        }

        return HandlerResult.pass();
    }

    public boolean isActive(Update update) {
        return getIdOptional(update)
                .map(orderManager::isActive)
                .orElse(false);
    }

}
