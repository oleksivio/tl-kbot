package ru.ioleksiv.telegram.bot.core.api.result;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.IAction;

import java.util.ArrayList;
import java.util.Collection;

public final class HandlerResult {
    private static final Logger LOG = LoggerFactory.getLogger(HandlerResult.class);

    private final ResultState state;
    private final Collection<IAction> actionCollection = new ArrayList<>();

    private HandlerResult(ResultState state) {
        this.state = state;
    }

    @NotNull
    public static HandlerResult noAction() {
        return new HandlerResult(ResultState.NO_ACTION);
    }

    @NotNull
    public static HandlerResult success() {
        return new HandlerResult(ResultState.SUCCESS);
    }

    @NotNull
    public static HandlerResult error() {
        return new HandlerResult(ResultState.ERROR);

    }

    @NotNull
    public static HandlerResult cancelSession() {
        return new HandlerResult(ResultState.CANCEL_SESSION);
    }

    public HandlerResult add(IAction action) {
        actionCollection.add(action);
        return this;
    }

    public boolean hasError() {
        return state == ResultState.ERROR;
    }

    public boolean hasCancelSession() {
        return state == ResultState.CANCEL_SESSION;
    }

    public boolean hasSuccess() {
        return state == ResultState.SUCCESS;
    }

    public boolean hasNoAction() {
        return state == ResultState.NO_ACTION;
    }

    public Iterable<IAction> getAction() {
        return actionCollection;
    }

    public boolean isEmpty() {
        return actionCollection.isEmpty();
    }
}