package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SessionProcessor implements TelegramProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatelessProcessor.class);

    private final Map<Integer, IHandler> mOrderMap = new HashMap<>();
    private final OrderManager mOrderManager = new OrderManager();
    private IHandler initialHandler = null;
    private IHandler cancelHandler = null;

    public void addOrderHandler(int order, IHandler handler) {
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
            else {
                return handlerResult;
            }

            return initialHandler.invoke(update);
        }

        if (mOrderManager.isActive() && cancelHandler.isAcceptable(update)) {
            mOrderManager.reset();

            return cancelHandler.invoke(update);
        }

        if (mOrderManager.isActive()) {
            IHandler handler = mOrderMap.get(mOrderManager.getCurrent());

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
            throw new IllegalArgumentException("Invalid session handler state. Can't be less than one" +
                                                       " @Session.Initial annotated method's");
        }

        if (cancelHandler == null) {
            throw new IllegalArgumentException("Invalid session handler state. Can't be less than one" +
                                                       " @Session.Cancel annotated method's");
        }
    }

    public void setInitialHandler(IHandler initialHandler) {
        this.initialHandler = initialHandler;
    }

    public void setCancelHandler(IHandler cancelHandler) {
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
