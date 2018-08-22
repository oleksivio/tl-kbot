package ru.ioleksiv.telegram.bot.core.controller.processor;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

public class SessionProcessor {
    private final SessionOrderManager orderManager;
    private final Handler initialHandler;
    private final Handler cancelHandler;

    public SessionProcessor(SessionOrderManager orderManager,
                            Handler initialHandler,
                            Handler cancelHandler) {
        this.orderManager = orderManager;
        this.initialHandler = initialHandler;
        this.cancelHandler = cancelHandler;
    }

    HandlerResult receive(Update update) {

        if (!orderManager.isActive() && initialHandler.hasSubscription(update)) {
            HandlerResult handlerResult = initialHandler.run(update);
            if (handlerResult.hasSuccess()) {
                orderManager.next();
            }
            return handlerResult;
        }

        if (orderManager.isActive() && cancelHandler.hasSubscription(update)) {
            orderManager.reset();

            return cancelHandler.run(update);
        }

        if (orderManager.isActive()) {
            Handler handler = orderManager.getCurrent();

            if (handler != null && handler.hasSubscription(update)) {

                HandlerResult handlerResult = handler.run(update);

                if (handlerResult.hasSuccess()) {
                    orderManager.next();
                    return handlerResult;
                }
                if (handlerResult.hasCancelSession()) {
                    orderManager.reset();
                    return handlerResult;
                }

                return HandlerResult.success();
            }

        }

        return HandlerResult.pass();
    }

}
