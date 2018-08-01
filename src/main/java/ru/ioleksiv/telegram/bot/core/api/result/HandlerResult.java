package ru.ioleksiv.telegram.bot.core.api.result;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HandlerResult {
    private static final Logger LOG = LoggerFactory.getLogger(HandlerResult.class);

    private final ResultState state;

    private HandlerResult(ResultState state) {
        this.state = state;
    }

    @NotNull
    public static HandlerResult pass() {
        return new HandlerResult(ResultState.PASS);
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

    public boolean hasError() {
        return state == ResultState.ERROR;
    }

    public boolean hasCancelSession() {
        return state == ResultState.CANCEL_SESSION;
    }

    public boolean hasSuccess() {
        return state == ResultState.SUCCESS;
    }

    public boolean isPassed() {
        return state == ResultState.PASS;
    }

}
