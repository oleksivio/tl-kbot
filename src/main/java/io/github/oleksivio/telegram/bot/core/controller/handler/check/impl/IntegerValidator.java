package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

public class IntegerValidator implements Validator<Integer> {
    private final int lessThan;
    private final int lessOrEqual;
    private final int moreThan;
    private final int moreOrEqual;

    public IntegerValidator(int lessThan, int lessOrEqual,
                            int moreThan, int moreOrEqual) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
    }

    @Override
    public boolean check(Integer argument) {
        return argument < lessThan && argument <= lessOrEqual && argument > moreThan && argument >= moreOrEqual;
    }

}
