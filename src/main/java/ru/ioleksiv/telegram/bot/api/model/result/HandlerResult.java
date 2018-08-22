package ru.ioleksiv.telegram.bot.api.model.result;

public final class HandlerResult {
    private final ResultState state;

    private HandlerResult(ResultState state) {
        this.state = state;
    }

    public static HandlerResult pass() {
        return new HandlerResult(ResultState.PASS);
    }

    public static HandlerResult success() {
        return new HandlerResult(ResultState.SUCCESS);
    }

    public static HandlerResult error() {
        return new HandlerResult(ResultState.ERROR);

    }

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
