package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.api.model.annotation.BooleanState;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

public class BooleanChecker implements Checker<Boolean> {

    private final BooleanState booleanState;

    public BooleanChecker(BooleanState booleanState) {
        this.booleanState = booleanState;
    }

    @Override
    public boolean check(@Nullable Boolean argument) {

        if (argument == null) {
            return false;
        }

        if (booleanState == BooleanState.NON_NULL) {
            return true;
        }

        if (booleanState == BooleanState.TRUE) {
            return argument;
        }

        if (booleanState == BooleanState.FALSE) {
            return !argument;
        }

        throw new UnsupportedOperationException("Unexpected boolean state");
    }

}
