package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

public class LongValidator implements Validator<Long> {
    private final long lessThan;
    private final long lessOrEqual;
    private final long moreThan;
    private final long moreOrEqual;

    public LongValidator(long lessThan, long lessOrEqual,
                         long moreThan, long moreOrEqual) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
    }

    @Override
    public boolean check(Long argument) {
        return argument < lessThan && argument <= lessOrEqual && argument > moreThan && argument >= moreOrEqual;
    }

}
