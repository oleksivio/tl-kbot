package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

public class DoubleChecker implements Checker<Double> {

    private final double lessThan;
    private final double lessOrEqual;
    private final double moreThan;
    private final double moreOrEqual;
    private final double equal;

    public DoubleChecker(double lessThan, double lessOrEqual, double moreThan, double moreOrEqual, double equal) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
        this.equal = equal;
    }

    @Override
    public boolean check(Double argument) {

        if (argument == null) {
            return false;
        }

        if (!Double.isNaN(equal) && Double.compare(argument, equal) != 0) {
            return false;
        }

        return argument < lessThan
                && argument <= lessOrEqual
                && argument > moreThan
                && argument >= moreOrEqual;
    }
}
