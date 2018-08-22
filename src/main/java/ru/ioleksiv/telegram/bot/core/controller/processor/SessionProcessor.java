package ru.ioleksiv.telegram.bot.core.controller.processor;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.model.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SessionProcessor {
    private final OrderManager orderManager = new OrderManager();
    private Handler initialHandler = null;
    private Handler cancelHandler = null;

    public void addOrderHandler(int order, Handler handler) {
        orderManager.put(order, handler);
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

    public void setInitialHandler(Handler initialHandler) {
        this.initialHandler = initialHandler;
    }

    public void setCancelHandler(Handler cancelHandler) {
        this.cancelHandler = cancelHandler;
    }

    private static class OrderManager {
        private final Map<Integer, Handler> orderMap = new HashMap<>();
        private int order = 0;

        private void put(int order, Handler handler) {
            orderMap.put(order, handler);
        }

        void next() {
            Set<Integer> orderValues = orderMap.keySet();
            int maximumValue = Collections.max(orderValues);

            order++;
            while (!orderValues.contains(order)) {
                order++;
                if (order > maximumValue) {
                    reset();
                    break;
                }
            }
        }

        void reset() {
            order = 0;
        }

        private boolean isActive() {
            return order != 0;
        }

        Handler getCurrent() {
            return orderMap.get(order);
        }

    }

}
