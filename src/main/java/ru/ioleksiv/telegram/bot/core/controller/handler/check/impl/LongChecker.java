package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

public class LongChecker implements Checker<Long> {
    private final long lessThan;
    private final long lessOrEqual;
    private final long moreThan;
    private final long moreOrEqual;

    public LongChecker(long lessThan, long lessOrEqual,
                       long moreThan, long moreOrEqual) {
        this.lessThan = lessThan;
        this.lessOrEqual = lessOrEqual;
        this.moreThan = moreThan;
        this.moreOrEqual = moreOrEqual;
    }

    @Override
    public boolean check(Long argument) {
        if (argument == null) {
            return false;
        }

        return argument < lessThan && argument <= lessOrEqual && argument > moreThan && argument >= moreOrEqual;

    }

}
