package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.api.exceptions.InvalidInputException;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionProcessor implements TelegramProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatelessProcessor.class);

    private final Map<Integer, IHandler> mOrderMap = new HashMap<>();
    private final Map<Integer, IHandler> mErrorMap = new HashMap<>();

    private final IHandler mInitialHandler;

    private final IHandler mCancelHandler;

    private final OrderManager mOrderManager = new OrderManager();

    public SessionProcessor(@NotNull IHandler initialHandler,
                            @NotNull IHandler cancelHandler) {
        mInitialHandler = initialHandler;
        mCancelHandler = cancelHandler;
    }

    public void addOrderHandler(int order, IHandler handler) {
        mOrderMap.put(order, handler);
    }

    public void addErrorHandler(int order, IHandler handler) {
        mErrorMap.put(order, handler);
    }

    @NotNull
    @Override
    public List<IAction> process(Update update) {

        if (!mOrderManager.isActive() && mInitialHandler.isAcceptable(update)) {
            mOrderManager.next(mOrderMap.keySet());

            return mInitialHandler.invoke(update);
        }

        if (mOrderManager.isActive() && mCancelHandler.isAcceptable(update)) {
            mOrderManager.reset();

            return mCancelHandler.invoke(update);
        }

        if (mOrderManager.isActive()) {
            IHandler handler = mOrderMap.get(mOrderManager.getCurrent());

            if (handler != null && handler.isAcceptable(update)) {

                try {
                    List<IAction> actions = handler.invoke(update);
                    mOrderManager.next(mOrderMap.keySet());
                    return actions;
                }
                catch (InvalidInputException ignored) {

                }

            }

            IHandler errorHandler = mErrorMap.get(mOrderManager.getCurrent());
            if (errorHandler != null) {
                return errorHandler.invoke(update);
            }
        }

        return Collections.emptyList();
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
