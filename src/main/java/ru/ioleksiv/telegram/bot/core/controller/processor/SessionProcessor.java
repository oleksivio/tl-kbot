package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SessionProcessor {
    private final Map<Integer, Handler> mOrderMap = new HashMap<>();
    // FixMe order manager: incapsulate logic
    private final OrderManager mOrderManager = new OrderManager();
    private Handler initialHandler = null;
    private Handler cancelHandler = null;

    public void addOrderHandler(int order, Handler handler) {
        mOrderMap.put(order, handler);
    }

    public void check() throws IllegalArgumentException {
        if (initialHandler == null) {
            throw new IllegalArgumentException("Invalid session unpacker state. " +
                                                       "Can't be less than one" +
                                                       " Session Initial method's");
        }

        if (cancelHandler == null) {
            throw new IllegalArgumentException("Invalid session unpacker state. " +
                                                       "Can't be less than one" +
                                                       " Session Cancel method's");
        }
    }

    @NotNull
    HandlerResult receive(Update update) {

        if (!mOrderManager.isActive() && initialHandler.hasSubscription(update)) {
            HandlerResult handlerResult = initialHandler.run(update);
            if (handlerResult.hasSuccess()) {
                mOrderManager.next(mOrderMap.keySet());
            }
            return handlerResult;
        }

        if (mOrderManager.isActive() && cancelHandler.hasSubscription(update)) {
            mOrderManager.reset();

            return cancelHandler.run(update);
        }

        if (mOrderManager.isActive()) {
            Handler handler = mOrderMap.get(mOrderManager.getCurrent());

            if (handler != null && handler.hasSubscription(update)) {

                HandlerResult handlerResult = handler.run(update);

                if (handlerResult.hasSuccess()) {
                    mOrderManager.next(mOrderMap.keySet());
                    return handlerResult;
                }
                if (handlerResult.hasCancelSession()) {
                    mOrderManager.reset();
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

        private int mOrder = 0;

        void next(Collection<Integer> orderValues) {
            int maximumValue = Collections.max(orderValues);

            mOrder++;
            while (!orderValues.contains(mOrder)) {
                mOrder++;
                if (mOrder > maximumValue) {
                    reset();
                    break;
                }
            }
        }

        void reset() {
            mOrder = 0;
        }

        private boolean isActive() {
            return mOrder != 0;
        }

        int getCurrent() {
            return mOrder;
        }

    }

}
