package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

public class DoubleValidator implements Validator<Double> {

    private final double lessThan;
    private final double lessOrEqual;
    private final double moreThan;
    private final double moreOrEqual;
    private final double equal;

    public DoubleValidator(double lessThan,
                           double lessOrEqual,
                           double moreThan,
                           double moreOrEqual,
                           double equal) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
        this.equal = equal;
    }

    @Override
    public boolean check(Double argument) {
        if (!Double.isNaN(equal) && Double.compare(argument, equal) != 0) {
            return false;
        }

        return argument < lessThan
                && argument <= lessOrEqual
                && argument > moreThan
                && argument >= moreOrEqual;
    }
}
