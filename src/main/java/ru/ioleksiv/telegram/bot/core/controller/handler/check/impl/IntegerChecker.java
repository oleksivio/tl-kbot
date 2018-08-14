package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

public class IntegerChecker implements Checker<Integer> {
    private final int lessThan;
    private final int lessOrEqual;
    private final int moreThan;
    private final int moreOrEqual;

    public IntegerChecker(int lessThan, int lessOrEqual,
                          int moreThan, int moreOrEqual) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
    }

    @Override
    public boolean check(Integer argument) {
        if (argument == null) {
            return false;
        }

        return argument < lessThan && argument <= lessOrEqual && argument > moreThan && argument >= moreOrEqual;

    }

}