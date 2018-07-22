package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.api.exceptions.InvalidInputException;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

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
    public List<IAction> invoke(@Nullable Update update) throws InvalidInputException {

        List<IAction> actions = new ArrayList<>();
        for (IHandler handler : mAcceptableHandlers) {
            actions.addAll(handler.invoke(update));
        }

        mAcceptableHandlers.clear();
        return actions;
    }

    public boolean isEmpty() {
        return mHandlers.isEmpty();
    }
}
