package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.BooleanState;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

public class BooleanValidator implements Validator<Boolean> {

    private final BooleanState booleanState;

    public BooleanValidator(BooleanState booleanState) {
        this.booleanState = booleanState;
    }

    @Override
    public boolean check(Boolean argument) {

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