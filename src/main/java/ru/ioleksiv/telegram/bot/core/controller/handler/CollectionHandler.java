package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.Collection;
import java.util.HashSet;

public class CollectionHandler implements IHandler {

    private final Collection<IHandler> mHandlers = new HashSet<>();

    private final Collection<IHandler> mAcceptableHandlers = new HashSet<>();

    public void add(IHandler handler) {
        mHandlers.add(handler);
    }

    @Override
    public boolean isAcceptable(@Nullable Update update) {
        mAcceptableHandlers.clear();

        for (IHandler handler : mHandlers) {
            if (handler.isAcceptable(update)) {
                mAcceptableHandlers.add(handler);
            }
        }

        return !mAcceptableHandlers.isEmpty();
    }

    // todo CHECK CODE
    @Override
    @NotNull
    public HandlerResult invoke(@Nullable Update update) {
        for (IHandler handler : mAcceptableHandlers) {
            HandlerResult handlerResult = handler.invoke(update);
            if (!handlerResult.hasNoAction()) {
                mAcceptableHandlers.clear();
                return handlerResult;
            }
        }

        return HandlerResult.noAction();
    }

    public boolean isEmpty() {
        return mHandlers.isEmpty();
    }
}
