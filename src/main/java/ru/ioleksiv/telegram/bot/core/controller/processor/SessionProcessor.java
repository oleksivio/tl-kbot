package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SessionProcessor implements TelegramProcessor {
    private final Map<Integer, Handler> mOrderMap = new HashMap<>();
    // FixMe order manager: incapsulate logic
    private final OrderManager mOrderManager = new OrderManager();
    private Handler initialHandler = null;
    private Handler cancelHandler = null;

    public void addOrderHandler(int order, Handler handler) {
        mOrderMap.put(order, handler);
    }

    @NotNull
    @Override
    public HandlerResult process(Update update) {

        if (!mOrderManager.isActive() && initialHandler.isAcceptable(update)) {
            HandlerResult handlerResult = initialHandler.invoke(update);
            if (handlerResult.hasSuccess()) {
                mOrderManager.next(mOrderMap.keySet());
            }
            return handlerResult;
        }

        if (mOrderManager.isActive() && cancelHandler.isAcceptable(update)) {
            mOrderManager.reset();

            return cancelHandler.invoke(update);
        }

        if (mOrderManager.isActive()) {
            Handler handler = mOrderMap.get(mOrderManager.getCurrent());

            if (handler != null && handler.isAcceptable(update)) {

                HandlerResult handlerResult = handler.invoke(update);

                if (handlerResult.hasSuccess()) {
                    mOrderManager.next(mOrderMap.keySet());
                    return handlerResult;
                }
                else if (handlerResult.hasCancelSession()) {
                    mOrderManager.reset();
                    return handlerResult;
                }

            }

        }

        return HandlerResult.noAction();
    }

    public void check() throws IllegalArgumentException {
        if (initialHandler == null) {
            throw new IllegalArgumentException("Invalid session handler state. " +
                                                       "Can't be less than one" +
                                                       " Session Initial method's");
        }

        if (cancelHandler == null) {
            throw new IllegalArgumentException("Invalid session handler state. " +
                                                       "Can't be less than one" +
                                                       " Session Cancel method's");
        }
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
