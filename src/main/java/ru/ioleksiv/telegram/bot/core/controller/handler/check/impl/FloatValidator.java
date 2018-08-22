package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

public class FloatValidator implements Validator<Float> {

    private final float lessThan;
    private final float lessOrEqual;
    private final float moreThan;
    private final float moreOrEqual;
    private final float equal;

    public FloatValidator(float lessThan,
                          float lessOrEqual,
                          float moreThan,
                          float moreOrEqual,
                          float equal) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
        this.equal = equal;
    }

    @Override
    public boolean check(Float argument) {
        if (!Float.isNaN(equal) && Double.compare(argument, equal) != 0) {
            return false;
        }

        return argument < lessThan
                && argument <= lessOrEqual
                && argument > moreThan
                && argument >= moreOrEqual;
    }
}
